import java.util.Scanner;

public class Ex9_1 {
    //Divisible by 3 but not divisible by 5
    public static void div_3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        div_3(a);
        input.close();
        
    }
}
