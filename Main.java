package src.main.java;

public class Main {
    public static void main(String[] args) {
        int value = 10;
        Operation operation = new Operation(value);

        OperationService operationService = new OperationService(); // Создание экземпляра OperationService

        AsyncInputOperationService asyncInputOperationService = new AsyncInputOperationService(operationService);
        asyncInputOperationService.startAsyncOperationProcessing();

        // Пример создания операции и сохранения её в StatementService
        Operation operation1 = new Operation(1);
        StatementService statementService = new StatementService(operation);
        statementService.saveOperation(operation1);
    }
}











