import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Payroll {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Сортировка работников по среднемесячной заработной плате с помощью Comparator
    public void sortByAverageMonthlySalary() {
        Collections.sort(employees, Comparator.comparingDouble(Employee::calculateAverageMonthlySalary));
        for (Employee employee : employees) {
            System.out.println("Имя работника: " + employee.name + "\nДолжность работника: " +
                    employee.position + "\nВозраст работника: " + employee.age +
                    "\nСреднемесячная заработная плата: " + employee.calculateAverageMonthlySalary()
                    + "\n \n");
        }
    }
}
