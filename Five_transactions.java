import java.util.Scanner;

public class Five_transactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите данные для транзакции " + i + ":");

            System.out.print("Введите название транзакции (String): ");
            String transactionName = scanner.next();

            System.out.print("Введите сумму транзакции (double): ");
            double transactionAmount = scanner.nextDouble();

            System.out.print("Введите статус транзакции (boolean - true/false): ");
            boolean transactionStatus = scanner.nextBoolean();

            System.out.println("Информация о транзакции " + i + ":");
            System.out.println("Название: " + transactionName);
            System.out.println("Сумма: " + transactionAmount);
            System.out.println("Статус: " + transactionStatus);
        }

        scanner.close();
    }
}

