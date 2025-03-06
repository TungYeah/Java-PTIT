import java.util.Arrays;
import java.util.Scanner;

public class daySoCong {
    public static boolean daySoCong(long[] arr, long n){
        Arrays.sort(arr);
        long capSoCong = arr[1] - arr[0];
        for (int i = 2; i < n; i ++){
            if (arr[i] - arr[i - 1] != capSoCong){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            if (daySoCong(arr, n )){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}
