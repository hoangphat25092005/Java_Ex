import java.util.Scanner;

public class Ex9_2 {
    //all strings in arr have length > 3
    public static void printStrings(String[] arr) {
        for (String str : arr) {
            if (str.length() > 3) {
                System.out.print(str + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arr = new String[n];
        input.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine();
        }
        printStrings(arr);
        input.close();
    }
}
