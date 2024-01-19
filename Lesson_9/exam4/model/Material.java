package Lesson_9.exam4.model;

public enum Material {
    SILVER("silver", 2.5),
    GOLD("gold", 120.5),
    WHITE_GOLD("white gold", 125);

    private String rusTitle;
    private double pricePerGram;

    Material(String rusTitle, double pricePerGram) {
        this.rusTitle = rusTitle;
        this.pricePerGram = pricePerGram;
    }

    public double getPricePerGram() {
        return pricePerGram;
    }

    @Override
    public String toString() {
        return "Material{" +
                "rusTitle='" + rusTitle + '\'' +
                ", pricePerGram=" + pricePerGram +
                "} " + super.toString();
    }
}
