package abstraction;

public class Manager extends Person {

    private int employees;

    public Manager(String name, int age, int employees) {
        super(name, age);
        this.employees = employees;
    }

    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void description() {
        System.out.println("I am a Manager");
        System.out.println();
        System.out.println("I have " + employees + " employees");
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
}
