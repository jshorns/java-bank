import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BankStatement {

    // could these be static methods? since the statement itself doesn't store any info.
    // or would that be bad practice because it makes source of the method unclear?
    public String formatTransaction(Transaction transaction){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String date = transaction.getDate().format(formatter);
        String credit = (transaction.isDeposit() ? " " + (String.format("%.2f", transaction.getAmount()) + " ") : " ");
        String debit = (transaction.isDeposit() ? " " : (" " + String.format("%.2f", transaction.getAmount()) + " "));
        String balanceAfter = String.format("%.2f", transaction.getBalanceAfter());
        return date + " ||" + credit + "||" + debit + "|| " + balanceAfter;
    }

    public String formatStatement(TransactionHistory transactionHistory){
        String newLine = System.getProperty("line.separator");
        StringBuilder statement = new StringBuilder();
        statement.append("date || credit || debit || balance\n");
        for (int i = transactionHistory.getTransactions().size(); i-- > 0;) {
            statement.append(formatTransaction(transactionHistory.getTransactions().get(i)))
            .append(newLine);
        }
        return statement.toString();
    }
}