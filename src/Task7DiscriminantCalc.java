import java.util.Scanner;

/**
 * Created by Yauheni Krasko on 14.06.2017.
 */
public class Task7DiscriminantCalc {
    public static void main(String[] args) {
        int x,
                x1,
                x2;
        Scanner equation = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = equation.nextInt();
        System.out.println("Enter b:");
        int b = equation.nextInt();
        System.out.println("Enter c:");
        int c = equation.nextInt();

        int d = discriminant(a, b, c);

        if (isPositive(d)){
            x1 = (int)(-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            x2 = (int)(-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println("Полученные корни уравнения: x1=" + x1 + " x2=" + x2);
        } else if (izZero(d)){
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень х=" + x);
        } else System.out.println("Уравнение не имеет вещественных корней");
    }

    static int discriminant(int rootA, int rootB, int rootC){
        int a = rootA;
        int b = rootB;
        int c = rootC;
        int discr = (int) Math.pow(b, 2) - 4 * a * c;
        return discr;
    }

    static boolean isPositive(int d){
        if (d >0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean izZero (int d){
        if (d == 0) {
            return true;
        } else {
            return false;
        }
    }
}
