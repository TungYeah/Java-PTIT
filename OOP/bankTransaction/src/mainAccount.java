import java.util.ArrayList;
import java.util.Scanner;

public class mainAccount {
    public static int findAccount(Account[] list,String STK){
        for (int i = 0; i < list.length; i++){
            if (list[i].getSTK().equals(STK)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Account[] list = new Account[n];
        for (int i = 0; i < n; i++){
            list [i]= new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
            int q = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < q; i++){
                String type = sc.nextLine();
                if (type.equals("transfer")){
                    String X = sc.next();
                    String Y = sc.next();
                    int soTien = Integer.parseInt(sc.next());
                    int x = findAccount(list, X);
                    int y = findAccount(list, Y);
                    if (list[x].getSoDu() - 50000 >= soTien){
                        list[x].setSoDu(list[x].getSoDu() - soTien);
                        list[y].setSoDu(list[y].getSoDu() + soTien);
                    }
            }
              else if (type.equals("withdraw")){
                    String X = sc.next();
                    int soTien  = Integer.parseInt(sc.next());
                    int x = findAccount(list, X);
                    if (list[x].getSoDu() >= soTien){
                        list[x].setSoDu(list[x].getSoDu() - soTien);
                    }
                }
              else {
                    String X = sc.next();
                    int soTien = Integer.parseInt(sc.next());
                    int x = findAccount(list,X);
                    list[x].setSoDu(list[x].getSoDu() - soTien);
                }
        }
            for (Account x : list){
                System.out.println(x);
            }
    }
}
