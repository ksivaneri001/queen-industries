import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    protected double bonus;
    protected List<Employee> reports;
    private int tier;

    public Manager(double salary, double bonus, String name, String department, String title, ArrayList reports, int tier) {
        super(salary, name, department, title);
        this.bonus = bonus;
        this.reports = reports;
        this.tier = tier;
    }

    public double getBonus() {
        return bonus;
    }

    public List<Employee> getReports() {
        return reports;
    }

    @Override
    public int getTier() {
        return tier;
    }

    public void hire(Employee employee) throws Exception {
        if (this.compareTo(employee) <= 0) throw new Exception("ERROR: cannot fire an Employee of an equal or greater tier.");
        else {
            this.reports.add(employee);
            System.out.println("LOG: new Employee hired (" + employee.getName() + ", " + employee.getDepartment() + ", " + employee.getTitle() + ")");
        }
    }

    public void fire(Employee employee) throws Exception {
        if (!this.getDepartment().equals(employee.getDepartment())) throw new Exception("ERROR: cannot fire an Employee who is not a direct or indirect report.");
        else if (this.compareTo(employee) <= 0) throw new Exception("ERROR: cannot fire an Employee of an equal or greater tier.");
        else {
            this.reports.remove(employee);
            System.out.println("LOG: existing Employee fired (" + employee.getName() + ", " + employee.getDepartment() + ", " + employee.getTitle() + ")");
        }
    }

    public void adjustSalary(int amount, Employee employee) throws Exception {
        if (this.compareTo(employee) <= 0) throw new Exception("ERROR: cannot supervise an Employee of an equal or greater tier.");
        else employee.salary += amount;
    }
}
