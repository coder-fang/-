import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/2/10 21:40
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int m = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int mid = 0;
        if (n % 2 == 0) {
            mid = n / 2;
        } else {
            mid = (n - 1) / 2;
        }
        if (mid - 1 >= 0) {
            m = arr[mid - 1];
        }
        System.out.println(m);
    }
}
