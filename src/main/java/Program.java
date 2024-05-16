import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Построить три класса (базовый и 2 потомка), описывающий некоторых работников с почасовой
 * оплатой (один из потомков - фрилансер) и фиксированной оплатой (второй потомок - окладник)
 * а) Описать в базовом классе абстрактный метод для расчета среднемесячной заработной платы.
 * Для фрилансеров формула для расчета: СрЗП = 20,8 * 8 * почасовая ставка, для окладников:
 * = оклад.
 * б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.
 *
 * !!!!!!Доделать: создать массив сотрудников и заполнить его ^^^^
 *
 * в) **Реализовать интерфейс для сортировки (Comparator, Comparable).
 *
 * !!!!!! Переделать в интерфейс ^^^^
 *
 * г) **Создать класс, содержащий массив или коллекцию сотрудников (как повременщик,
 * так и фрилансер), и реализовать вывод данных с использованием foreach (поработать с
 * интерфейсом iterable)
 *
 * !!!!!Использовать iterable ^^^^
 *
 */
public class Program {
    public static void main(String[] args) {
        Worker w1 = new Worker("worker1", "mover", 25,50.00);
        Worker w2 = new Worker("worker2", "lowyer", 30,180.00);
        Worker w3 = new Worker("worker3", "economist", 33,150.00);
        Worker w4 = new Worker("worker4", "logistician", 28,160.00);

        Payroll employees= new Payroll();
        employees.addEmployee(w1);
        employees.addEmployee(w2);
        employees.addEmployee(w3);
        employees.addEmployee(w4);

        employees.sortByAverageMonthlySalary();

        Company sal = new Company();
        sal.addEmployee(w1);
        sal.addEmployee(w2);
        sal.addEmployee(w3);
        sal.addEmployee(w4);

//        sal.printEmployeeData();

    }
}
