package Lesson_5.HomeTask.Task_2;

import java.util.Arrays;

public class EmployeeList {
    private final int INITIAL_SIZE = 6;
    private Employee[] employees = new Employee[INITIAL_SIZE];
    private int currentSize = 0;

    private boolean isValidByIndex(int index) {
        return (index >= 0 && index < currentSize);
    }

    public void addEmployee(Employee employee) {
        if (employee != null) {
            if (currentSize == employees.length) {
                employees = Arrays.copyOf(employees, employees.length * 3 / 2 + 1);
            }
            employees[currentSize++] = employee;
        }
    }

    public void addEmployees(Employee... emps) {
        for (Employee emp : emps) {
            addEmployee(emp);
        }
    }

    public void showEmployeeByIndex(int index) {
        if (isValidByIndex(index)) {
            System.out.println(employees[index]);
        }
    }

    public void showEmployees() {
        System.out.println("capacity = " + employees.length);
        System.out.println("current size = " + currentSize);
        for (int i = 0; i < currentSize; i++) {
            System.out.println(employees[i]);
        }
    }

    public void delEmployeeByIndex(int index) {
        if (isValidByIndex(index)) {
            System.arraycopy(employees, index + 1, employees, index, currentSize - index - 1);
            currentSize--;
        }
    }

    public double getAverageSalary() {
        double averageSalary = 0.0;
        for (int i = 0; i < currentSize; i++) {
            averageSalary += employees[i].getSalary();
        }
        return (averageSalary / currentSize);
    }
}
