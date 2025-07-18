package accounter;

public abstract class Account {
    public void setBalance(long balance) {
        this.balance = balance;
    }

    private long balance;


    public long getBalance() {
        return balance;
    }

    public abstract boolean add(long amount);

    abstract boolean pay(long amount);

    abstract boolean transfer(Account account, long amount);



}
