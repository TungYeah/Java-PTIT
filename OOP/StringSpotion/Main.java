package OOP.StringSpotion;

import java.util.Scanner;

class Main {
    public static String stringSplosion(String str) {
        StringBuilder test = new StringBuilder();
        for (int i = 0; i <= str.length(); i++) {
            test.append(str.substring(0, i));
        }
        return test.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(stringSplosion(s));
        }
    }
}
