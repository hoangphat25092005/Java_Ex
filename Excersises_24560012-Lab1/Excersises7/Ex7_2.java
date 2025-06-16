import java.util.Scanner;
public class Ex7_2 {
    public static void main(String[] args) {
        int s = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                //Print on the same line
                System.out.print(a[i] + " ");
            }
        }

        input.close();
        System.out.println(); // Print a new line after all even numbers
    }
}
