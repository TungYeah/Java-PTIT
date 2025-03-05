import java.util.Scanner;

public class soHoanHao {
    public static boolean soHoanHao(long n) {
        if (n < 2) return false;
        long sum = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0){
            long n = sc.nextLong();
            if (soHoanHao(n)){
                System.out.println(1);
            }
            else
                System.out.println(0);
        }
    }
}
