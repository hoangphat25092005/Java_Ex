import java.util.Scanner;

public class Ex7_6 {

    //INsertion sort in ascending order
    public static void INsertion(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            // Move elements of a[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        INsertion(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        input.close();
    }
}
