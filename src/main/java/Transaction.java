import java.time.LocalDateTime;

public class Transaction {
    private float amount;
    private boolean deposit;
    private LocalDateTime date;
    private float balanceAfter;

    public Transaction(float amount, boolean deposit, float balanceAfter) {
        this(amount, deposit, balanceAfter, LocalDateTime.now());
    }

    public Transaction(float amount, boolean deposit, float balanceAfter, LocalDateTime date) {
        this.amount = amount;
        this.deposit = deposit;
        this.balanceAfter = balanceAfter;
        this.date = date;
    }

    public LocalDateTime getDate(){
        return this.date;
    }

    public float getAmount(){
        return this.amount;
    }

    public boolean isDeposit() {
        return this.deposit;
    }

    public float getBalanceAfter(){
        return this.balanceAfter;
    }
}
