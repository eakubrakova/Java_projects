package src.main.java;
import java.util.Date;

public class Main {
    public void saveOperation(Operation operation) {
        // Логика сохранения операции
    }

    public static void main(String[] args) {
        Operation operation = new Operation(1, new Date(), "Description", 100.0);
        Main main = new Main();
        main.saveOperation(operation);
    }
}





