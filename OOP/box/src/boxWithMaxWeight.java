import java.util.ArrayList;

public class boxWithMaxWeight extends Box {
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Item> items;

    public void BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : items) {
            if (i.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }

}
