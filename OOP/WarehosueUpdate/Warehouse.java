package OOP.WarehosueUpdate;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        prices = new HashMap<>();
        stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (!stocks.containsKey(product)) {
            return false;
        }
        int currentStock = stocks.get(product);
        if (currentStock <= 0) {
            return false;
        }
        stocks.put(product, currentStock - 1);
        return true;
    }
}