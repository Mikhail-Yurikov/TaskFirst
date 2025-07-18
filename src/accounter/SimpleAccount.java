package accounter;

public class SimpleAccount extends Account {

    public SimpleAccount(long balance) {
        setBalance(balance);
    }

    @Override
    public boolean add(long amount) {
        long start = getBalance();
        setBalance(getBalance() + amount);
        return getBalance() - start == amount;
    }

    @Override
    boolean pay(long amount) {
        if (getBalance() >= amount) {
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
