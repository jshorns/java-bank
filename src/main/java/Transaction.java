import java.time.LocalDateTime;

public class Transaction {
    public float amount;
    public boolean deposit;
    public LocalDateTime date;
    public float balanceAfter;

    public Transaction(float amount, boolean deposit, float balanceAfter) {
        this(amount, deposit, balanceAfter, LocalDateTime.now());
    }

    public Transaction(float amount, boolean deposit, float balanceAfter, LocalDateTime date) {
        this.amount = amount;
        this.deposit = deposit;
        this.balanceAfter = balanceAfter;
        this.date = date;
    }
}
