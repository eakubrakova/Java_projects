package src.main.java;

import java.util.Date;

public class LoanOperation extends Operation implements ConsolePrintable {
    private int loanId;

    public LoanOperation(int operationId, Date date, String description, double amount, int loanId) {
        super(operationId, date, description, amount);
        this.loanId = loanId;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Loan ID: " + loanId);

    }

}