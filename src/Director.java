import java.util.ArrayList;

public class Director extends Manager {

    private double stockShares;
    private int tier;

    public Director(double salary, double stockShares, double bonus, String name, String department, String title, ArrayList reports, int tier) {
        super(salary, bonus, name, department, title, reports, tier);
        this.stockShares = stockShares;
        this.tier = tier;
    }

    public double getStockShares() {
        return stockShares;
    }
}
