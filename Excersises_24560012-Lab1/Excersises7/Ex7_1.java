import java.util.Scanner;

public class Ex7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(a[0] + a[n - 1]);
        input.close();
    }
}
