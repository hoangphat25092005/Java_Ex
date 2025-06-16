import java.util.Scanner;
public class Ex7_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = input.nextInt();
            }
        }

        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] % 5 == 0) { // Check if the number is divisible by 5
                    s += a[i][j]; // Add to the sum of numbers divisible by 5
                }
            }
        }
        System.out.println(s);
        input.close();
    }
}
