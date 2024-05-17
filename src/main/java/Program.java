/**
 * Построить три класса (базовый и 2 потомка), описывающий некоторых работников с почасовой
 * оплатой (один из потомков - фрилансер) и фиксированной оплатой (второй потомок - окладник)
 * а) Описать в базовом классе абстрактный метод для расчета среднемесячной заработной платы.
 * Для фрилансеров формула для расчета: СрЗП = 20,8 * 8 * почасовая ставка, для окладников:
 * = оклад.
 * б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.
 * в) **Реализовать интерфейс для сортировки (Comparator, Comparable).
 * г) **Создать класс, содержащий массив или коллекцию сотрудников (как повременщик,
 * так и фрилансер), и реализовать вывод данных с использованием foreach (поработать с
 * интерфейсом iterable)
 * !!!!!Использовать iterable ^^^^
 */
public class Program {
    public static void main(String[] args) {
// в
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Freelancer("Алиса", "Программист", 25, 25.0));
        employeeManager.addEmployee(new Worker("Владимир", "Экономист", 30, 3000.0));

        for (Employee employee : employeeManager.employees) {
            System.out.println(employee.name + ": " + employee.calculateAverageMonthlySalary() + "\n");
        }

        employeeManager.sortEmployees();

//г
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(new Worker("worker1", "Уборщик", 25, 50.00));
        employeeList.addEmployee(new Worker("worker2", "Юрист", 30, 180.00));
        employeeList.addEmployee(new Worker("worker3", "Экономист", 33, 150.00));
        employeeList.addEmployee(new Worker("worker4", "Логист", 28, 160.00));

        for (Employee employee : employeeList) {
            System.out.println("Имя: " + employee.name + ", Должность: " + employee.position);
        }

        System.out.println();

        //Если уже имеется список работников
        EmployeeList employeeList2 = new EmployeeList(employeeManager.getEmployees());
        for (Employee employee : employeeList2) {
            System.out.println("Имя: " + employee.name + ", Должность: " + employee.position);
        }
    }
}