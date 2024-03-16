package src.main.java;

public class StatementService {
    private Operation operation;

    public StatementService(Operation operation) {
        this.operation = operation;
    }

    public void saveOperation(Operation operation) {
        // Логика сохранения операции
        System.out.println("Operation saved successfully.");
    }
}
