package bookkeeping;

import taxes.TaxSystem;
import text.Main;

public class Company {
    String title;
    int debit;
    int credit;
    private TaxSystem taxsystem;

    public Company(String title, TaxSystem taxsystem) {
        this.title = title;
        this.taxsystem = taxsystem;
    }

    public void setTaxSystem(TaxSystem taxsystem) {
        this.taxsystem = taxsystem;
    }

    void shiftMoney(int amount) {
        if (amount != 0) {
            if (amount > 0) {
                debit += amount;
            } else {
                credit += Math.abs(amount);
            }
        }
    }

    public void payTaxes() {
        int tax = taxsystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб.\n", title, tax);
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            credit += deal.creditChange;
            debit += deal.debitChange;
        }

        int margin = debit - credit;
        payTaxes();
        return margin;
    }
}
