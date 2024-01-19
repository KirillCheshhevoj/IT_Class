package Lesson_9.exam3.model;

public class Rabbit {
    private String name;
    private String eyeColor;
    private String woolColor;
    private double weight;


    public Rabbit(Rabbit r) {//глубокое копирование/ создаются новые объекты типа String/
        this(new String(r.name), new String(r.eyeColor), new String(r.woolColor), r.weight);
    }

    public Rabbit(String name, String eyeColor, String woolColor, double weight) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static double getAverageWeight(Rabbit rabbit1, Rabbit rabbit2) {
        double average = (rabbit1.weight + rabbit2.weight) / 2;
        return average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rabbit rabbit = (Rabbit) o;

        if (Double.compare(rabbit.weight, weight) != 0) return false;
        if (name != null ? !name.equals(rabbit.name) : rabbit.name != null) return false;
        if (eyeColor != null ? !eyeColor.equals(rabbit.eyeColor) : rabbit.eyeColor != null) return false;
        return woolColor != null ? woolColor.equals(rabbit.woolColor) : rabbit.woolColor == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (eyeColor != null ? eyeColor.hashCode() : 0);
        result = 31 * result + (woolColor != null ? woolColor.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", woolColor='" + woolColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
