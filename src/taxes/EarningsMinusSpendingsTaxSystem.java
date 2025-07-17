package taxes;

public class EarningsMinusSpendingsTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (debit - credit) * 15 / 100;
        return Math.max(tax, 0);
    }
}
