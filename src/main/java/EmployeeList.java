import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class EmployeeList implements Iterable<Employee> {
    private List<Employee> employees;

    public EmployeeList(List<Employee> employeesarr) {
        employees = new ArrayList<>();
        employees.addAll(employeesarr);

    }

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}