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







