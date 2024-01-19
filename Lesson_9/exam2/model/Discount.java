package Lesson_9.exam2.model;

public enum Discount {
    UNDISCOUNTED(1),
    // public static final Discount UNDISCOUNTED = new Discount("UNDISCOUNTED", 0, 1.0)
    DISCOUNTED(0.9),
    REDDISCOUNTED(0.75);

    private double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // калі метад не выкарыстоўвае поля канкрэтнага пералічэння
    // то яго стоіць апісаць як static
    public static void method() {
        System.out.println("!!!!!");
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discount=" + discount +
                ", name=" + name() + '\'' +
                ", ordinal=" + ordinal() +
                "} " + super.toString();
    }
}
