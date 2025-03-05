import java.util.Scanner;

public class soArmstrong {
    public static boolean soArmstrong(long n){
        long sum = 0, temp = n;
        int soChuSo = String.valueOf(n).length();

        while (temp > 0) {
            long digit = temp % 10;
            sum += Math.pow(digit, soChuSo);
            temp /= 10;
        }

        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0){
            long n = sc.nextLong();
            if (soArmstrong(n)){
                System.out.println(1);
            }
            else
                System.out.println(0);
        }
    }
}
