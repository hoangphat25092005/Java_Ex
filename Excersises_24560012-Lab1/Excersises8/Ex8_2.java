import java.util.Scanner;

public class Ex8_2 {
    //number of uppercase letters in str
    public static int numberOfUppercase(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int cnt = numberOfUppercase(str);
        System.out.println(cnt);
        input.close();
    }
}
