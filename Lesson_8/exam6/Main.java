package Lesson_8.exam6;

import Lesson_8.exam6.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Igor", 1000),
                new Employee("Vasya", 1000) {
                    @Override
                    public double getGeneralSalary() {
                        return (super.getGeneralSalary()+ 500);
                    }

                    // можна створываць новыя паля і метады,
                    // но бачыць іх праз спасылкі Employee нельга
                    public void method() {
                        System.out.println("New method");
                    }
        },
                new Employee("Masha", 1000),
                new Employee("Vika", 1000),
        };

        for(Employee employee:employees) {
            System.out.println(employee);
        }
    }
}
