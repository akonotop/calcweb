package com.sanya.calculator;

public class CalculatorService {
    private double leftNumber;
    private double rightNumber;
    private String operation;

    public CalculatorService(double leftNumber, double rightNumber, String operation) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
        this.operation = operation;
    }

    public double getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(double leftNumber) {
        this.leftNumber = leftNumber;
    }

    public double getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(double rightNumber) {
        this.rightNumber = rightNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double calculate()  {
        double result = 0;
        switch (this.operation) {
            case  "+":
                result = this.leftNumber + this.rightNumber;
                break;
            case "-":
                result = this.leftNumber - this.rightNumber;
                break;
            case "*":
                result = this.leftNumber * this.rightNumber;
                break;
            case "/":
                result = this.leftNumber / this.rightNumber;
                break;
        }
        return result;
    }
}