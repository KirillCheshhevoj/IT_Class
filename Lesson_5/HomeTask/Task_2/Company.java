package Lesson_5.HomeTask.Task_2;

public class Company {
    public static double getAverageSalary(Employee[] employees) {
        double averageSalary = 0.0;
        for (int i = 0; i < employees.length; i++) {
            averageSalary += employees[i].getSalary();
        }
        return (averageSalary / employees.length);
    }

    public static Employee[] getListEmployee(Employee[] employee, int startExp, int endExp) {
        int sizeArray = 0, index = -1;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getExperience() >= startExp && employee[i].getExperience() < endExp) {
                sizeArray++;
            }
        }
        Employee[] array = new Employee[sizeArray];

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getExperience() >= startExp && employee[i].getExperience() < endExp) {
                index++;
                array[index] = employee[i];
            }
        }
        return array;
    }
}
