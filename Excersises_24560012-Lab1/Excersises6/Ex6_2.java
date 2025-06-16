import java.util.Scanner;
public class Ex6_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int s = 0;
        for (int i = a; i <= b; i++) {
            s += i;
        }
        System.out.println(s);
        input.close();
    }
}
