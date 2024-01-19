package Lesson_9.exam5.model;

public class Pan extends Crockery {
    private static double priceByType = 10;

    public Pan(Crockery crockery) {
        super(crockery);
    }

    public Pan(int article, double volume, Material material) {
        super(article, volume, material);
    }

    @Override
    public double getCost() {
        double cost = priceByType * getPriceByMaterial() * getVolume();
        return cost;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "article=" + getArticle() +
                ", volume=" + getVolume() +
                ", cost=" + getCost() +
                '}';
    }
}
