import java.util.Scanner;

public class Ex5_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if ( a < b && a < c && b < c) {
            System.out.println("Increasing");
        } else if (a > b && a > c && b > c) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing");
        }
        input.close();

    }
}
