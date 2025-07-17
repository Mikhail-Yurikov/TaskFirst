package bookkeeping;

import taxes.EarningsMinusSpendingsTaxSystem;
import taxes.EarningsTaxSystem;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Газпром", new EarningsMinusSpendingsTaxSystem());
        company.shiftMoney(500);
        company.shiftMoney(500);
        company.shiftMoney(200);
        company.shiftMoney(-200);
        company.payTaxes();
        company.setTaxSystem(new EarningsTaxSystem());
        company.shiftMoney(500);
        company.shiftMoney(500);
        company.shiftMoney(200);
        company.shiftMoney(-200);
        company.payTaxes();

        company.setTaxSystem(new EarningsMinusSpendingsTaxSystem());

        Deal[] deals = new Deal[]{new Sale("Газ", 500),
                new Sale("Реклама", 200),
                new Expenditure("Труба", 300)};
        company.applyDeals(deals);


    }
}
