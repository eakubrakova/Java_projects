package src.main.java;

import java.util.ArrayList;
import java.util.List;

// Класс работы с операциями клиентов
public class OperationService {
    public int performOperation(int operand1, int operand2, String operation) {
        if (operation.equals("add")) {
            return operand1 + operand2;
        } else if (operation.equals("subtract")) {
            return operand1 - operand2;
        } else {
            return 0;
        }
    }
}
