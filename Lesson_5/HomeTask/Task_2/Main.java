package Lesson_5.HomeTask.Task_2;

// 2.1. Создайте класс Employee, отражающий информацию о сотруднике на фирме (имя,
//стаж, оклад - одинаковый для всех)
//2.2. Наследуйте от класса Employee ряд конкретных должностей c дополнительными
//премиями по контракту к окладу: Security(10%), Administrator(20%), Developer(200%) и
//т.д.
//2.3. Определите размер стажевой премии (процент от оклада), зависящей от стажа (до 5
//лет - нет премии, от 5 до 15 – 20%, от 15 до 25 – 40%)
//2.4. Зарплата по должностям начисляется в зависимости от оклада, стажа и премии.
//2.5. Создайте массив из 9 сотрудников (по три из каждой категории)
//2.6. Вычислите среднюю зарплату по предприятию.
//2.7. Создайте отдельный массив, хранящий информацию только о людях относящихся к
//стажевой категории (от 15 до 25 лет)
public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        //добавление объектов по одному
        employeeList.addEmployee(new Security("Roman", 10));
        employeeList.addEmployee(new Security("Sergey", 16));
        employeeList.addEmployee(new Administrator("Maria", 7));
        employeeList.addEmployee(new Administrator("Katrin", 16));
        employeeList.addEmployee(new Developer("Vitaliy", 18));
        employeeList.addEmployee(new Developer("Alex", 3));

        int size = 3;
        Employee[] emps = new Employee[size];
        emps[0] = new Security("Ivan", 10);
        emps[1] = new Administrator("Anna", 6);
        emps[2] = new Developer("Pavel", 22);

        //добавление нескольких объектов
        employeeList.addEmployees(emps);

        //вывод списка объектов
        employeeList.showEmployees();

        //вывод объекта по индексу
        employeeList.showEmployeeByIndex(3);

        //удаление по индексу
        employeeList.delEmployeeByIndex(8);
        employeeList.showEmployees();

        //средняя ЗП всех работников
        System.out.println("Average salary employees = " + employeeList.getAverageSalary());
    }
}
