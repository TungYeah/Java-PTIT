
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDate s1 = new SimpleDate(1 ,2, 2000);
        System.out.println(s1.equals("heh"));
        System.out.println(s1.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(s1.equals(new SimpleDate(1, 2, 2000)));
        }
    }
