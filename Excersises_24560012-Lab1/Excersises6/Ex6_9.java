import java.util.Scanner;

public class Ex6_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double c = Math.pow(a * 1.0, b * 1.0);
        System.out.println(c);
    }
}
