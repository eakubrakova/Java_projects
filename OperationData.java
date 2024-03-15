package src.main.java;

import java.io.*;

public class OperationData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String operationName;
    private int operand1;
    private int operand2;
    private int result;

    public OperationData(String operationName, int operand1, int operand2, int result) {
        this.operationName = operationName;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }

    // геттеры и сеттеры

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}


