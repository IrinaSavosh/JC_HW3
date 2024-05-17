import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    protected String name;
    protected String position;
    protected int age;

    Employee(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public abstract double calculateAverageMonthlySalary();



}
