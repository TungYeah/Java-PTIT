import java.util.ArrayList;
import java.util.Scanner;

public class mainBankAccount {
    public static boolean checkAccount(ArrayList<BankAccount> list, String username, String password){
        for (BankAccount x : list){
            if (x.getUsername().equals(username) && x.getPassword().equals(password))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BankAccount> list = new ArrayList<>();
        for (int i = 0; i < n ; i++){
            BankAccount acc = new BankAccount(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(acc);
        }
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0 ;i < q; i++){
            String username = sc.nextLine();
            String password =sc.nextLine();
            if (checkAccount(list,username,password)){
                System.out.println("Login Successful");
            }
            else System.out.println("Login False");
        }
    }

}
