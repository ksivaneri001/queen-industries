import java.util.ArrayList;

public class Director extends Manager {

    private double stockShares;
    private int tier;

    public Director(int salary, int bonus, double stockShares, String name, String department, String title, ArrayList reports, int tier) {
        super(salary, bonus, name, department, title, reports, tier);
        this.stockShares = stockShares;
        this.tier = tier;
    }
}
