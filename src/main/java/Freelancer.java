public class Freelancer extends Employee {
    private double hourlyRate;

    public Freelancer(String name, String position, int age, double hourlyRate) {
        super(name, position, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }

}
