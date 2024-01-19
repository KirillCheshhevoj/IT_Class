package Lesson_9.exam5.model;

public class Plate extends Crockery {
    private static double priceByType = 5;

    public Plate(Crockery crockery) {
        super(crockery);
    }

    public Plate(int article, double volume, Material material) {
        super(article, volume, material);
    }

    @Override
    public double getCost() {
        double cost = priceByType * getPriceByMaterial() * getVolume();
        return cost;
    }


    @Override
    public String toString() {
        return "Plate{" +
                "article=" + getArticle() +
                ", volume=" + getVolume() +
                ", cost=" + getCost() +
                '}';
    }
}
