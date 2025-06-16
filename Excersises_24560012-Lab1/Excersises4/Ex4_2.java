import java.util.Scanner;
public class Ex4_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int tmp = a;
        a = b;
        b = tmp;

        //After swaping
        System.out.println("After swapping, " + "a= " + a + " b= " + b);
        input.close();
    }
}