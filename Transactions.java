import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Transactions {
    private Date date;
    private String description;
    private double amount;

    public Transactions(Date date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

class TransactionSystem {
    private List<Transactions> transactions;

    public TransactionSystem() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transactions transaction) {
        transactions.add(transaction);
    }

    public void findTransactionsByDateRange(Date startDate, Date endDate) {
        for (Transactions transaction : transactions) {
            if (transaction.getDate().after(startDate) && transaction.getDate().before(endDate)) {
                System.out.println("Date: " + transaction.getDate() + ", Description: " + transaction.getDescription() + ", Amount: " + transaction.getAmount());
            }
        }
    }
}






