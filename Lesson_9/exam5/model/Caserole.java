package Lesson_9.exam5.model;

public class Caserole extends Crockery {
    private static double priceByType = 20;

    public Caserole(Crockery crockery) {
        super(crockery);
    }

    public Caserole(int article, double volume, Material material) {
        super(article, volume, material);
    }

    @Override
    public double getCost() {
        double cost = priceByType * getPriceByMaterial() * getVolume();
        return cost;
    }

    @Override
    public String toString() {
        return "Caserole{" +
                "article=" + getArticle() +
                ", volume=" + getVolume() +
                ", cost=" + getCost() +
                '}';
    }
}
