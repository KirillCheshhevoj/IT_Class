package Lesson_9.exam4.model;

public class Necklace extends Jewellery {
    private static double necklaceDifficultFactor = 1.4;

    public Necklace() {
    }

    public Necklace(int article, double weight, Material material, Producer producer) {
        super(article, weight, material, producer);
    }

    public static double getNecklaceDifficultFactor() {
        return necklaceDifficultFactor;
    }

    public static void setNecklaceDifficultFactor(double necklaceDifficultFactor) {
        Necklace.necklaceDifficultFactor = necklaceDifficultFactor;
    }

    @Override
    public double getDifficultFactor() {
        return 0;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "article=" + getArticle() +
                ", weight=" + getWeight() +
                ", material=" + getMaterial() +
                ", producer=" + getProducer() +
                ", calculatePrice=" + calculatePrice() +
                "} " + super.toString();
    }
}
