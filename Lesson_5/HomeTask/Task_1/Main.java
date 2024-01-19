package Lesson_5.HomeTask.Task_1;

/*1. Покупка товара
        1.1. Создать класс ProductPurchase (name, price, number (количество купленного товара)).
        1.2. Определить в классе ProductPurchase параметрический конструктор
        1.3. Создать класс DiscountProductPurchase наследуемый от ProductPurchase (скидка в
        10%).
        1.4. Класс DiscountRedProductPurchase наследуемый от Purchase (скидка 50%).
        1.5. В каждом классе реализовать метод getGeneralCost(), который выводит сумму
        покупки.
        1.6. Реализовать конструкторы классов DiscountProductPurchase и
        DiscountRedProductPurchase через вызов конструктора класса ProductPurchase
        1.7. В установить get/set методы, переопределить метод toString();
        1.8. Создать массив, хранящий информацию о 6 покупках товаров
        1.9. Вывести полную информацию об объектах и сумме покупки getGeneralCost().
        1.10. Подсчитать общую стоимость покупок без скидки и со скидками.
*/
public class Main {
    public static void main(String[] args) {
        ProductList products = new ProductList();
        products.addProduct(new ProductPurchase("Cocoa", 4.5, 2));
        products.addProduct(new ProductPurchase("Tea", 5.5, 3));
        products.addProduct(new DiscountProductPurchase("Milk", 2.8, 4));
        products.addProduct(new DiscountRedProductPurchase("Bekon", 15.78, 5));

        //вывод инфы о всех продуктах
        products.showProducts();
        //Добавление объекта
        products.addProduct(new DiscountProductPurchase("Shocolate", 3.5, 5));
        //вывод инфы по индексу
        System.out.println("Info index = 4");
        products.showProductByIndex(4);
        //выод инфр о всех
        System.out.println("totalInfo");
        products.showProducts();
        //удаление по индексу
        products.delProductByIndex(4);
        System.out.println("totalInfo");
        products.showProducts();
        //добавление объектов
        products.addProducts(new ProductPurchase("Water AQUA", 2.25, 3), new ProductPurchase("Cookies", 25.8, 5));
        System.out.println("totalInfo");
        products.showProducts();
        //Подcчитать общую стоимость покупок без скидки и со скидками
        System.out.println("Без скидки = " + products.getTotalCostNoDiscount());
        System.out.println("Со скидкой = " + products.getTotalCostTheDiscount());
    }
}
