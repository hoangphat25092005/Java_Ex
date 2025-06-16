import java.util.Scanner;
public class Ex6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int div_3_sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}