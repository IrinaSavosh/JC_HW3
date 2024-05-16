public class Worker extends Employee{
    private double salary;

    public Worker(String name, String position, int age, double salary) {
        super(name, position, age);
        this.salary = salary;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return salary;
    }
}
