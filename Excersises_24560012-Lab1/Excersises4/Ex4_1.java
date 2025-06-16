import java.util.Scanner;
public class Ex4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        int tmp = 15;
        // Output the age after 15 years
        System.out.println("After " + tmp + " years " + name + " will be " + (age + tmp) + " years old");
        input.close();
    }
}
