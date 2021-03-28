public class Employee implements Comparable {

    protected double salary;
    protected String name;
    protected String department;
    protected String title;
    private int tier;

    public Employee(double salary, String name, String department, String title) {
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.title = title;
        this.tier = 1;
    }

    public int getTier() {
        return tier;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        return this.getTier() - employee.getTier();
    }
}
