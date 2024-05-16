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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18)
            this.age = age;
        else
            System.out.println("Введен не корректный возраст");
    }
}
