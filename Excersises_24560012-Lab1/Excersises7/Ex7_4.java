import java.util.Scanner;
public class Ex7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        // Find the maximum value in the array
        int sum_odd = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0 && a[i] > 0) { // Check if the number is odd
                sum_odd += a[i]; // Add to the sum of odd numbers
            }
        }
        System.out.println(sum_odd);
        input.close();
    }
}
