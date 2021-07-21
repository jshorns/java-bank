import java.time.LocalDateTime;

public class Transaction {
    public float amount;
    public boolean deposit;
    public LocalDateTime date;

    public Transaction(float amount, boolean deposit) {
        this(amount, deposit, LocalDateTime.now());
    }

    public Transaction(float amount, boolean deposit, LocalDateTime date) {
        this.amount = amount;
        this.deposit = deposit;
        this.date = date;
    }
}
