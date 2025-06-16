import java.util.Scanner;

public class Ex9_4 {
    public static double circumference(double r) {
        return 2 * 3.14 * r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = input.nextDouble();
        double circ = circumference(r);
        System.out.printf("The circumference of the circle with radius %.2f is: %.2f%n", r, circ);
        input.close();
    }
}
