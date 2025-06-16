import java.util.Scanner;

public class Ex9_5 {
    //Recursive sum_odd from 1 to n
    public static int sum_odd(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 1) {
            return n + sum_odd(n - 1);
        } else {
            return sum_odd(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sum_odd(n));
        input.close();
    }
}
