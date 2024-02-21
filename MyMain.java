import java.util.Date;

public class MyMain {
    public static void main(String[] args) {
        TransactionSystem system = new TransactionSystem();

        // Добавление транзакций
        system.addTransaction(new Transactions(new Date(), "Покупка товара", 100.0));
        system.addTransaction(new Transactions(new Date(), "Оплата счета", 50.0));

        // Поиск транзакций за выбранный диапазон дат
        Date startDate = new Date(); // Установите начальную дату
        Date endDate = new Date();   // Установите конечную дату

        system.findTransactionsByDateRange(startDate, endDate);
    }
}
