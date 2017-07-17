package Lesson13RegExp;

import java.io.*;
import java.util.regex.*;

/**
 * Created by ADMIN on 17.07.2017.
 */
public class Lesson13Test {
    public static void main(String[] args) {
        //Task 1
        System.out.printf("Task 1. Matcher for e-mail%n%n");

        String email1 = "kraskoe@mail.com";
        String email2 = "8raskoe@mail.com";
        String email3 = "krasko_e@mail.org";
        String email4 = "kraskoe@.com";

        isEmail(email1);
        isEmail(email2);
        isEmail(email3);
        isEmail(email4);

        //Task 2
        System.out.printf("%nTask 2. Find all hexes%n%n");

        String testText = "Применение. Шестнадцатеричный код широко 0X12AF16 применяется в низкоуровневом программировании, " +
                "а также в различных 0xff86 компьютерных справочных документах. Популярность системы обоснована архитектурными" +
                " решениями 0x1.0p-3 современных компьютеров: в них в качестве 0x2378h минимальной единицы информации установлен байт " +
                "(состоящий из восьми бит) — а значение байта удобно записывать с помощью двух 012fa шестнадцатеричных цифр." +
                " Значение байта может ранжироваться с #00 до #FF (от 0 до 255 в десятичной записи) — другими словами, " +
                "используя шестнадцатеричный код, можно x25fa записать любое состояние байта, при этом не остаётся «лишних» " +
                "не используемых в записи цифр.";
        String test = "dsgsg";
        Pattern pat = Pattern.compile("0[xX][0-9a-fA-F]+\\.?[0-9a-fA-f]*p?-?[0-9]*");
        Matcher mat = pat.matcher(testText);
        while (mat.find()){
            System.out.printf("Match found: %s%n", mat.group());
        }

        //Task 3
        System.out.printf("%nTask 3. Find html tags%n%n");

        File filein = new File("tmp", "html.txt");
        File fileout = new File("tmp", "html2.txt");
        String stringHtml = new String();
        String tempStr = new String();
        try (BufferedReader fr = new BufferedReader(new FileReader(filein))){
            while ((tempStr = fr.readLine()) != null){
                stringHtml += tempStr + "\n";
            }
        } catch (IOException ie){
            ie.printStackTrace();
        }

        String processedString = stringHtml.replaceAll("<p.*?>", "<p>");

        try (FileWriter fw = new FileWriter(fileout)){
            fw.write(processedString);
        } catch (IOException ie){
            ie.printStackTrace();
        }

        //Task 4
        System.out.printf("%nTask 4. Format telephone numbers%n%n");

        String telStr = "These are correct telephone numbers: +375445776198, +375298741265 and these are incorrect:" +
                "+324449548736, +3752914563214";
        String formattedStr = telStr.replaceAll("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})\\b", "$1 ($2) $3-$4-$5");
        System.out.println(formattedStr);

        //Task 5
        System.out.printf("%nTask 5. Check IPv4%n%n");

        String address1 = "255.001.15.190";
        String address2 = "259.1.15.190";
        String address3 = "255.1024.15.190";
        String address4 = "255.1.515.190";
        String address5 = "0.01.15.190";

        isIPv4(address1);
        isIPv4(address2);
        isIPv4(address3);
        isIPv4(address4);
        isIPv4(address5);
    }

    public static boolean isEmail(String s){
        Pattern pattern = Pattern.compile("[a-zA-Z]\\w*@\\w+(\\.com|\\.org)");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()){
            System.out.printf("String %s is correct e-mail%n", s);
        } else System.out.printf("String %s is not correct e-mail%n", s);
        return matcher.matches();
    }

    public static boolean isIPv4 (String s){
        Pattern addpat = Pattern.compile("(25[0-5]|2[0-5]\\d|1\\d{2}|[1-9]\\d|\\d)\\.\1\\.\1\\.\1");
        Matcher addmat = addpat.matcher(s);
        if (addmat.matches()){
            System.out.printf("This is a valid IPv4 address: %s%n", s);
            return true;
        } else {
            System.out.printf("This is not a valid IPv4 address: %s%n", s);
            return false;
        }
    }
//    public static boolean isIPv4 (String s){
//        Pattern addpat = Pattern.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");
//        Matcher addmat = addpat.matcher(s);
//        if (addmat.matches()){
//            if ((Integer.parseInt(addmat.group(1)) < 256) && (Integer.parseInt(addmat.group(2)) < 256) &&
//                    (Integer.parseInt(addmat.group(3)) < 256) && (Integer.parseInt(addmat.group(4)) < 256)){
//                System.out.printf("This is a valid IPv4 address: %s%n", s);
//                return true;
//            } else {
//                System.out.printf("This is not a valid IPv4 address: %s%n", s);
//                return false;
//            }
//        } else {
//            System.out.printf("This is not a valid IPv4 address: %s%n", s);
//            return false;
//        }
//    }
}
