import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для вывода данных с использованием foreach
    public void printEmployeeData() {
        for (Employee employee : employees) {
            System.out.println("Среднемесячная зарплата работника: " + employee.calculateAverageMonthlySalary());
        }
    }
}
