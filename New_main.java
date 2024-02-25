package src.main.java;

import java.util.Date;

public class New_main {
    public static void main(String[] args) {
        Operation[] operations = new Operation[100]; // Массив для хранения операций
        Customer[] customers = new Customer[100]; // Массив для хранения клиентов
        int[][] statement = new int[customers.length][10]; // Двумерный массив для принадлежности операции клиенту

        // Пример заполнения данных по клиенту с id = 1
        statement[1][0] = 2;
        statement[1][1] = 20;
        statement[1][2] = 38;
        statement[1][3] = 125;

        // Пример создания клиента из консоли
        Customer newCustomer = new Customer(101, "John Doe", "john@example.com", "1234567890");
        customers[newCustomer.getCustomerId()] = newCustomer;

        // Пример принадлежности операции клиенту при вводе операции
        int clientId = 1; // Пример id клиента
        int operationId = 2; // Пример id операции
        statement[clientId][0] = operationId;

        // Реализация метода поиска всех операций клиента
        int clientIdToSearch = 1; // Пример id клиента для поиска операций
        Operation[] clientOperations = getOperations(clientIdToSearch, statement, operations);

        // Вывод операций клиента в консоль
        printClientOperations(clientOperations);
    }

    public static Operation[] getOperations(int clientId, int[][] statement, Operation[] operations) {
        // Логика поиска всех операций клиента по его id
        return null;
    }

    public static void printClientOperations(Operation[] operations) {
        // Логика вывода операций клиента в консоль
        // Используйте метод print() для каждой операции
    }
}