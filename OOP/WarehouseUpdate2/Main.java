package OOP.WarehouseUpdate2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 2);
        warehouse.addProduct("yogurt", 2, 20);

        warehouse.take("buttermilk");
        warehouse.take("milk");
        warehouse.take("buttermilk");

        Set<String> productsLeft = new HashSet<>();
        for (String product : warehouse.products()) {
            if (warehouse.stock(product) > 0) {
                productsLeft.add(product);
            }
        }

        for (String product : productsLeft) {
            System.out.println(product);
        }
    }
}