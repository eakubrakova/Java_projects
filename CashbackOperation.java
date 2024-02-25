package src.main.java;

import java.util.Date;

public class CashbackOperation extends Operation implements ConsolePrintable {
    private int cashbackAmount;

    public CashbackOperation(int operationId, Date date, String description, double amount, int cashbackAmount) {
        super(operationId, date, description, amount);
        this.cashbackAmount = cashbackAmount;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Cashback Amount: " + cashbackAmount);
    }
}

