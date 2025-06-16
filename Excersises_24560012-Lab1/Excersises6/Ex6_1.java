import java.util.Scanner;

public class Ex6_1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = n; i >= - n; i--) {
            System.out.print(i);
        }
        input.close();
    }
}
