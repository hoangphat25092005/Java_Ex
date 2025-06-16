import java.util.Scanner;

public class Ex5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("The point lines in the First quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in the Second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in the third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in the fourth quadrant");
        } else {
            System.out.println("Other places");
        }
        input.close();
    }
}
