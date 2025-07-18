package accounter;

public class CreditAccount extends Account {

    private final Long LIMIT;

    public CreditAccount(long balance) {
        LIMIT = -balance;
    }

    @Override
    public boolean add(long amount) {
        if (getBalance() + amount <= 0) {
            setBalance(getBalance() + amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean pay(long amount) {
        if (getBalance() - amount >= LIMIT) {
            setBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean transfer(Account account, long amount) {
        return pay(amount) && account.add(amount);
    }
}
