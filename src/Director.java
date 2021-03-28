import java.util.ArrayList;

public class Director extends Manager {

    private double stockShares;
    private int tier;

    public Director(double salary, double stockShares, double bonus, String name, String department, String title, ArrayList reports, int tier) throws Exception {
        super(salary, bonus, name, department, title, reports, tier);

        for (Object o : this.reports) {
            Employee employee = (Employee) o;
            if (employee.getTier() >= 3) throw new Exception("ERROR: cannot supervise an Employee of an equal or greater tier.");
        }

        this.stockShares = stockShares;
        this.tier = tier;
    }

    @Override
    public int getTier() {
        return tier;
    }

    public double getStockShares() {
        return stockShares;
    }
}
