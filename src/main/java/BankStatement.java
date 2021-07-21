import java.time.format.DateTimeFormatter;

public class BankStatement {

    public String formatTransaction(Transaction transaction){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String date = transaction.date.format(formatter);
        String credit = (transaction.deposit ? " " + (String.format("%.2f", transaction.amount) + " ") : " ");
        String debit = (transaction.deposit ? " " : (" " + String.format("%.2f", transaction.amount) + " "));
        String balanceAfter = String.format("%.2f", transaction.balanceAfter);
        return date + " ||" + credit + "||" + debit + "|| " + balanceAfter;
    }
}