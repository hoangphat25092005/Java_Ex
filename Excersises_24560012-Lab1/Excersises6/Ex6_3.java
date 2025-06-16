import java.util.Scanner;

public class Ex6_3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s_odd = 0;
        for (int i = 1; i <= n; i+=2) {
            s_odd += i;
        }

        System.out.println(s_odd);
    }
}
