package Lesson_4.HomeTask.Task5;

// Создать класс товар, содержащий наименование товара и его цену без скидки.
// Наименование товара и цену сделать свойствами
// Дополнить класс методом, возвращающим цену товара со скидкой 10%
// Перегрузить метод, возвращающий цену со скидкой, для возвращения цены
// товара с заданной произвольной скидкой.
// Создать метод для отображения данных объекта
// В консольном приложении создать товар и вывести о нём информацию.
public class Product {
    private String name;
    private double price;

    public Product() {
        this(null, 0.0);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double Discount() {
        final double DISCOUNT = 10.0;
        return price - (price / DISCOUNT);
    }

    public double DISCOUNT(double size) {
        final int TOTAL = 100;
        double discount = (price / TOTAL) * size;
        return (price - discount);
    }

    public void info() {
        System.out.printf("Name: %s%nPrice: %.2f rub.%n", name, price);
    }
}
