import java.util.Scanner;

public class Ex9_6 {
    //sum recursive in array
    public static int sum_arr(int[] a, int n) {
        if (n == 0) {
            return 0;
        } else {
            return a[n - 1] + sum_arr(a, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(sum_arr(a, n));
        input.close();
    }
}
