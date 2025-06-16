import java.util.Scanner;

public class Ex6_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt = 0;
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt += 2;
            }
        }

        System.out.println(cnt);
        input.close();

    }
}
