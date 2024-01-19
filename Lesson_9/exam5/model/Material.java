package Lesson_9.exam5.model;

public enum Material {
    CAST_IRON(7),
    ALUMINUM(2.9),
    STEEL(9.85),
    PARCELAIN(11);

    private double perPrice;

    Material(double perPrice) {
        this.perPrice = perPrice;
    }

    public double getPerPrice() {
        return perPrice;
    }
}
