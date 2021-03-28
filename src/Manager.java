import java.util.ArrayList;

public class Manager extends Employee {

    protected int bonus;
    protected ArrayList reports;

    public Manager(int salary, int bonus, String name, String department, String title, ArrayList reports, int tier) {
        super(salary, name, department, title);
        this.bonus = bonus;
        this.reports = reports;
    }
}
