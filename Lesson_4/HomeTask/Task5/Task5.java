package Lesson_4.HomeTask.Task5;

public class Task5 {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", 250.70);
        double discount = 15.5;
        product1.info();
        System.out.printf("Price with discount 10 = %.2f\n", product1.Discount());
        System.out.printf("Price with discount %.1f%C = %.2f\n", discount, 37, product1.DISCOUNT(discount));
    }
}
