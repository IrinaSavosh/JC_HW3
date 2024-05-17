public class Worker extends Employee {
    private double salary;
    private double averageSalary;


    public Worker(String name, String position, int age, double salary) {
        super(name, position, age);
        this.salary = salary;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Имя: " + super.name +
                "Должность: " + super.position +
                "Возраст: " + super.age +
                "Средняя зарплата: " + averageSalary;

    }
}
