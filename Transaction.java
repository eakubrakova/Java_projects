import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату транзакции: ");
        String date = scanner.nextLine();

        System.out.print("Введите тип транзакции: ");
        String type = scanner.nextLine();

        System.out.print("Введите сумму транзакции: ");
        double amount = scanner.nextDouble();

        System.out.print("Введите описание транзакции: ");
        scanner.nextLine(); // Очистка буфера после ввода числа
        String description = scanner.nextLine();

        System.out.println("Информация о транзакции:");
        System.out.println("Дата: " + date);
        System.out.println("Тип: " + type);
        System.out.println("Сумма: " + amount);
        System.out.println("Описание: " + description);
    }
}
