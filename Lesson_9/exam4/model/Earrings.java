package Lesson_9.exam4.model;

public class Earrings extends Jewellery{
    private static double earringsDifficultFactor = 1.5;

    public Earrings() {
    }

    public Earrings(int article, double weight, Material material, Producer producer) {
        super(article, weight, material, producer);
    }

    public static double getEarringsDifficultFactor() {
        return earringsDifficultFactor;
    }

    public static void setEarringsDifficultFactor(double earringsDifficultFactor) {
        Earrings.earringsDifficultFactor = earringsDifficultFactor;
    }

    @Override
    public double getDifficultFactor() {
        return 0;
    }

    @Override
    public String toString() {
        return "Earrings{" +
                "article=" + getArticle() +
                ", weight=" + getWeight() +
                ", material=" + getMaterial() +
                ", producer=" + getProducer() +
                ", calculatePrice=" + calculatePrice() +
                "} " + super.toString();
    }
}
