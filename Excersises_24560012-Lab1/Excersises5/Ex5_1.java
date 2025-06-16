import java.util.Scanner;
public class Ex5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 10 && n <= 100) {
            System.out.println(n + " is in the range [10, 100]");
        } else {
            System.out.println(n + " is not in the range [10, 100]");
        }
        input.close();
    }
}
