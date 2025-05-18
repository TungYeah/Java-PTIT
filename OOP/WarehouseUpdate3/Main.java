package OOP.WarehouseUpdate3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Item milk = new Item("milk", 4, 2);
        Item buttermilk = new Item("buttermilk", 10, 2);

        milk.printItemInfo();
        buttermilk.printItemInfo();

        warehouse.importProduct(milk);
        warehouse.importProduct(buttermilk);

        warehouse.removeProduct("milk", 1);
        warehouse.removeProduct("buttermilk", 3);

        warehouse.printWarehouseInfo();

        warehouse.decreaseQuantityInWarehouseByOne();

        warehouse.printWarehouseInfo();

        List<Item> itemsToCheck = new ArrayList<>();
        itemsToCheck.add(new Item("milk", 2));
        itemsToCheck.add(new Item("buttermilk", 6));

        warehouse.takeFromItemToWarehouse(itemsToCheck, "milk", 5);
        warehouse.takeFromItemToWarehouse(itemsToCheck, "buttermilk", 1);

        warehouse.printWarehouseInfo();
    }
}
