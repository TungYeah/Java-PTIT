package OOP.WarehouseUpdate3;

public class Item {
    private String product;
    private int quantity;
    private int unitPrice;
    private int originalQuantity;

    public Item(String product, int quantity, int price) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = price;
        this.originalQuantity = quantity;
    }

    public Item(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getOriginalQuantity() {
        return originalQuantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return quantity * unitPrice;
    }

    public void printItemInfo() {
        System.out.println("Product: " + product + " has quantity " + quantity + " with price: " + getTotalPrice());
    }
}
