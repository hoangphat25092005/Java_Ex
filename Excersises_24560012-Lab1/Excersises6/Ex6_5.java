
import java.util.Scanner;

public class Ex6_5 {
    public int factorial (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } 
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Ex6_5 x = new Ex6_5();
        System.out.println(x.factorial(n));
        input.close();
    }
}
