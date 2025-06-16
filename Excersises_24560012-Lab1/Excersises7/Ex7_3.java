import java.util.Scanner;

public class Ex7_3 {
    //Bin search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int k = input.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                cnt++;
            }
        }
        System.out.println(cnt);
        input.close();
    }
}
