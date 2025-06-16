import java.util.Scanner;

public class Ex8_1 {

    //First occurence in a string
    public static int first_occurrence(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i; // Return the index of the first occurrence
            }
        }
        return -1; // Return -1 if the character is not found
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char c = input.next().charAt(0);
        int index = first_occurrence(s, c);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
        input.close();
    }
}
