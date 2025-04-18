public abstract class Organism implements Moveable {
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "x:" + x + ";y:" + y;
    }
}
