import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeManager implements iEmployeeSorter {
    List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortEmployees() {
        Collections.sort(employees, Comparator.comparingDouble(Employee::calculateAverageMonthlySalary));
        for (Employee employee : employees) {
            System.out.println("Имя работника: " + employee.name + "\nДолжность работника: " +
                    employee.position + "\nВозраст работника: " + employee.age +
                    "\nСреднемесячная заработная плата: " + employee.calculateAverageMonthlySalary()
                    + "\n \n");
        }
    }
}
