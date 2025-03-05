import java.math.BigInteger;
import java.util.Scanner;

public class giaiThuaSoLon {
    public static BigInteger giaiThua(int n) {
        BigInteger kq = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            kq = kq.multiply(BigInteger.valueOf(i));
        }
        return kq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0 ){
            int n = sc.nextInt();
            System.out.println(giaiThua(n));
        }
    }
}
