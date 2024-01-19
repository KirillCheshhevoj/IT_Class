package Lesson_16.HomeTask.model;

public class Calculate<T extends Number> {
    private T value1;
    private T value2;

    public Calculate(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    public Double getSum() {
        Double sum = value1.doubleValue() + value2.doubleValue();
        return sum;
    }

    public Double getDifference() {
        Double diff = value1.doubleValue() - value2.doubleValue();
        return diff;
    }

    public Double getMultiplication() {
        Double multi = (value1.doubleValue() * value2.doubleValue());
        return multi;
    }

    public Double getDividing() {
        Double div = (value1.doubleValue() / value2.doubleValue());
        return div;
    }

    public static Double getDoubleCalculation(Calculate<? extends Number> obj) {
        Double res = (obj.getMultiplication() - obj.getSum()) * 2;
        return res;
    }

    public static Double getTripleCalculation(Calculate<? extends Number> obj) {
        Double res = (obj.getSum() * 3) + Math.pow(obj.getMultiplication(), 3);
        return res;
    }
}
