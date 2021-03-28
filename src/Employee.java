public class Employee implements Comparable {

    protected int salary;
    protected String name;
    protected String department;
    protected String title;
    private int tier;

    public Employee(int salary, String name, String department, String title) {
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.title = title;
        this.tier = 1;
    }

    public int getTier() {
        return tier;
    }

    public int getSalary() {
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
