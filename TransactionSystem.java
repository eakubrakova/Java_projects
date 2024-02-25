package src.main.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TransactionSystem {
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

    public static void main(String[] args) {
        TransactionSystem system = new TransactionSystem();

        // Создаем несколько транзакций
        Transactions transaction1 = new Transactions(new Date(), "Purchase 1", 50.0);
        Transactions transaction2 = new Transactions(new Date(), "Purchase 2", 75.0);

        // Добавляем транзакции в систему
        system.addTransaction(transaction1);
        system.addTransaction(transaction2);

        // Находим транзакции в заданном диапазоне дат
        Date startDate = new Date(2024, 1, 1); // Пример начальной даты
        Date endDate = new Date(2024, 1, 31);   // Пример конечной даты
        system.findTransactionsByDateRange(startDate, endDate);
    }
}
