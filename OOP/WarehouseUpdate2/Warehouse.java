package OOP.WarehouseUpdate2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        int newStock = currentStock - 1;
        if (newStock < 0) {
            newStock = 0;
        }
        stocks.put(product, newStock);
        return true;
    }

    public Set<String> products() {
        return stocks.keySet();
    }
}
