package src.main.java;

public class AsyncInputOperationService {
    private OperationService operationService;

    public AsyncInputOperationService(OperationService operationService) {
        this.operationService = operationService;
    }

    public void startAsyncOperationProcessing() {
        // Логика запуска обработки асинхронных операций
        System.out.println("Starting async operation processing...");
    }
}





