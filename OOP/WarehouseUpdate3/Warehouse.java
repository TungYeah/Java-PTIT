package OOP.WarehouseUpdate3;

import java.util.HashMap;
import java.util.List;

public class Warehouse {
    private HashMap<String, Item> items = new HashMap<>();

    public void importProduct(Item item) {
        items.put(item.getProduct(), item);
    }

    public void removeProduct(String product, int quantity) {
        if (items.containsKey(product)) {
            Item item = items.get(product);
            int newQuantity = item.getQuantity() - quantity;
            if (newQuantity < 0)
                newQuantity = 0;
            item.setQuantity(newQuantity);
        }
    }

    public void decreaseQuantityInWarehouseByOne() {
        for (Item item : items.values()) {
            int newQuantity = item.getQuantity() - 1;
            if (newQuantity < 0)
                newQuantity = 0;
            item.setQuantity(newQuantity);
        }
    }

    public void takeFromItemToWarehouse(List<Item> itemsToCheck, String product, int quantity) {
        Item checkItem = null;
        for (Item item : itemsToCheck) {
            if (item.getProduct().equals(product)) {
                checkItem = item;
                break;
            }
        }
        if (checkItem == null) {
            return;
        }

        if (items.containsKey(product)) {
            Item itemInWarehouse = items.get(product);
            int maxAdd = checkItem.getQuantity();
            int toAdd = quantity > maxAdd ? maxAdd : quantity;
            itemInWarehouse.setQuantity(itemInWarehouse.getQuantity() + toAdd);
        }
    }

    public void printWarehouseInfo() {
        for (Item item : items.values()) {
            item.printItemInfo();
        }
    }
}
