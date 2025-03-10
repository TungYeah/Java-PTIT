public class Book {
    private String name;
    private Author athour;
    private double price;
    private int qty = 0;

    public Book(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author athour, double price, int qty) {
        this.name = name;
        this.athour = athour;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAthour() {
        return athour;
    }

    public void setAthour(Author athour) {
        this.athour = athour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + "," +athour.toString() + ", price" + price + ", qty" + qty +"]";
    }
}
