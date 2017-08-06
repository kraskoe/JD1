package Lesson21JDBC;

import java.net.ConnectException;
import java.sql.*;
import java.util.ResourceBundle;

/**
 * Created by User on 06.08.2017.
 */
public class Lesson21JDBCUsage {
//    private static final String url = "jdbc:mysql://localhost:3306/booksdb2";
//    private static final String user = "root";
//    private static final String password = "root";
    private static ResourceBundle resource = ResourceBundle.getBundle("Lesson21JDBC//database");
    private static final String url = resource.getString("url");
    private static final String user = resource.getString("user");
    private static final String password = resource.getString("password");

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String[] args) {
        String query1 = "select count(*) from books";
        String query2 = "SELECT concat(authors.name, \" \", authors.surname) AS book_author, authors.origin,\n" +
                "  AVG(books.pages) AS average_pages FROM authors\n" +
                "#   (SELECT * FROM (SELECT AVG(books.pages) FROM books) AS av_p) AS average_pages FROM authors\n" +
                "  INNER JOIN shares ON author_id = authors.id\n" +
                "  INNER JOIN books ON title_id = books.id\n" +
                "GROUP BY (authors.name)\n" +
                "HAVING average_pages > (SELECT AVG(books.pages) FROM books)";
        String query3 = "INSERT INTO books VALUES (NULL, 'Spaceman', 'science fiction', 115)";

        try {
            con = DriverManager.getConnection(url,user,password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query1);
            while (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Number of books is: " + count);
            }
            rs = stmt.executeQuery(query2);
            while (rs.next()) {
                System.out.printf("Author: %s. Origin: %s. Average pages: %.2f%n", rs.getString(1),rs.getString(2),rs.getDouble(3));
            }
            stmt.executeUpdate(query3);
            stmt.executeUpdate("INSERT INTO books VALUES (NULL, 'Spacewoman', 'science fiction', 116)");
            stmt.addBatch("INSERT INTO books VALUES (NULL, 'Spaceboy', 'science fiction', 117)");
            stmt.addBatch("INSERT INTO books VALUES (NULL, 'Spacegirl', 'science fiction', 118)");
            stmt.executeBatch();

            rs = stmt.executeQuery("SELECT * FROM books");
            while (rs.next()){
                System.out.printf("Book: %s. Genre: %s. Pages: %d.%n", rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            stmt.executeUpdate("DELETE FROM books WHERE books.name LIKE 'Space%'");
        } catch(SQLException se){
            se.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
                rs.close();
            } catch (SQLException sqe){
                sqe.printStackTrace();
            }
        }
    }
}
