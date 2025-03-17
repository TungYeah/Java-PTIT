import java.util.Scanner;

public class ChuanHoaTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] arr = s.split("\\s+");
        String res = "";
        for (String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for (int i = 1 ; i < x.length() ; i++){
                res += Character.toLowerCase(x.charAt(i));
            }
            res = " ";
        }
        s = res.trim();
        System.out.println(s);
    }
}
