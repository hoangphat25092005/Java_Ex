import java.util.Scanner;

public class Ex8_3 {
    //Reverse the string
    public static String reverse(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            char tmp = str.charAt(i);
            str = str.substring(0, i) + str.charAt(str.length() - 1 - i) + 
                  str.substring(i + 1, str.length() - 1 - i) + tmp + 
                  str.substring(str.length() - i);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String reversedStr = reverse(str);
        System.out.println(reversedStr);
        input.close();
    }
}