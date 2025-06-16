import java.util.Scanner;
public class Ex6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 24; i++) {
            if (i % 5 == 0) {
                System.out.print("\n");
                System.out.print(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
