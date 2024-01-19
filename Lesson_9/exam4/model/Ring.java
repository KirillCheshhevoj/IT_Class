package Lesson_9.exam4.model;

public class Ring extends Jewellery {
    private static double ringDifficultFactor = 1.3;
    private double size;

    public Ring() {
    }

    public Ring(Ring ring) {
        super(ring);
        size = ring.size;
    }

    public Ring(int article, double weight, Material material, Producer producer, double size) {
        super(article, weight, material, producer);
        this.size = size;
    }

    public static double getRingDifficultFactor() {
        return ringDifficultFactor;
    }

    public static void setRingDifficultFactor(double ringDifficultFactor) {
        Ring.ringDifficultFactor = ringDifficultFactor;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getDifficultFactor() {
        return ringDifficultFactor;
    }

    @Override
    public String toString() {
        return "Ring{} " +
                "size=" + size +
                ", article=" + getArticle() +
                ", weight=" + getWeight() +
                ", material=" + getMaterial() +
                ", producer=" + getProducer() +
                ", calculatePrice=" + calculatePrice() +
                '}';
    }
}
