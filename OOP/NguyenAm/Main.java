package OOP.NguyenAm;

import java.util.Scanner;

public class Main {
    public static void checkVowel(String s) throws NotContainVowelException {
        String lower = s.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return;
            }
        }
        throw new NotContainVowelException("String not contain vowels");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();

            try {
                checkVowel(input);
                System.out.println("String has vowels");
            } catch (NotContainVowelException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
