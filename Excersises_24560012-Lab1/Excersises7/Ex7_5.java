import java.util.Scanner;
public class Ex7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] >= 0 && a[i] <= 10) {
                System.out.print(a[i] + " ");
            }
        }

        input.close();
    }
}
