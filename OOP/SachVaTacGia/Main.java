package OOP.SachVaTacGia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lớp Author với các hàm accessor, mutator và kiểm tra giá trị gender
class Author {
    private String name;
    private String email;
    private char gender; // chỉ chấp nhận 'f' hoặc 'm'

    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        setGender(gender);
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        if (gender == 'f' || gender == 'm') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender phải là 'f' hoặc 'm'");
        }
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

// Lớp Book với các hàm accessor, mutator và hàm toString() theo định dạng yêu
// cầu
class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book() {
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        // Tái sử dụng toString() của lớp Author
        return "Book[name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Đọc số lượng test case
        int n = Integer.parseInt(sc.nextLine().trim());
        List<Book> books = new ArrayList<>();

        // Với mỗi test case, đọc thông tin của Book và Author
        for (int i = 0; i < n; i++) {
            // Đọc kiểu đối tượng (mục đích ở đây chỉ là "Book")
            String type = sc.nextLine().trim();
            if (type.equals("Book")) {
                // Nhập thông tin của Book
                String bookName = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine().trim());
                int qty = Integer.parseInt(sc.nextLine().trim());

                // Đọc thông tin của Author (dòng kế tiếp phải là "Author")
                String authorType = sc.nextLine().trim();
                if (authorType.equals("Author")) {
                    String authorName = sc.nextLine();
                    String email = sc.nextLine();
                    char gender = sc.nextLine().trim().charAt(0);

                    Author author = new Author(authorName, email, gender);
                    Book book = new Book(bookName, author, price, qty);
                    books.add(book);
                }
            }
        }

        // Đọc dòng cuối cùng, khi gặp "End" thì in ra thông tin
        String end = sc.nextLine().trim();
        if (end.equals("End")) {
            // In ra thông tin của tất cả Book theo định dạng yêu cầu
            for (Book b : books) {
                System.out.println(b);
            }
        }

        sc.close();
    }
}
