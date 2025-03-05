import java.util.Scanner;

public class Bai1 {
    public static int soChinhPhuong(long L, Long R){
        Long soDau = (long)Math.ceil(Math.sqrt(L));
        Long soCuoi = (long)Math.floor(Math.sqrt(R));
        return (int)Math.max(0,soCuoi-soDau+1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0){
        Long L = sc.nextLong();
        Long R = sc.nextLong();
        System.out.println(soChinhPhuong(L,R));
        }
    }
}

