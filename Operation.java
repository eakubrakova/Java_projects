package src.main.java;

import java.util.Date;

public class Operation {
    private int operationId;
    private Date date;
    private String description;
    private double amount;

    public Operation(int operationId, Date date, String description, double amount) {
        this.operationId = operationId;
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public void print() {
        System.out.println("Operation Information:");
        System.out.println("Operation ID: " + operationId);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
        System.out.println("Amount: " + amount);
    }

}


