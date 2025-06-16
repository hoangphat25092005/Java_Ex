import java.util.Scanner;

public class Ex9_3 {
    //largest with 3 numbers
    public static int max_three(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int maxx = max_three(a, b, c);
        System.out.println("The largest number is: " + maxx);
        input.close();
    }
}
