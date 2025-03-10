import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        Book book = null;
        for (int i = 0; i < n; i++){
            String s = sc.nextLine();
            if (s.equals("Book")) {
                String nameBook = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine());
                int qty = Integer.parseInt(sc.nextLine());


            String p = sc.nextLine();
            if (p.equals("Author")) {
                String nameAuthor= sc.nextLine();
                String email = sc.nextLine();
                char gender = sc.nextLine().charAt(0);
                Author author = new Author(nameAuthor, email, gender);
                book =new Book (nameBook, author, price,qty);

                }
            }
        }
        String x = sc.nextLine();
        if (x.equals("End") &&  book != null){
            System.out.println(book);
        }
    }
}