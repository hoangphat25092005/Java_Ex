import java.util.Scanner;
public class Ex4_3 {
    public static void main (String[] args) {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double ans = 2 * PI * r;
        System.out.println("Circumference = " + ans);
        input.close();
    }
}