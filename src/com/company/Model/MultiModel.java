package com.company.Model;

public class MultiModel implements CalcModel {
    double multiplicationValue;
    @Override
    public void result(Double firstNumber, Double secondNumber){
        multiplicationValue = firstNumber*secondNumber;
    }

    public double getMultiplicationValue() {
        return multiplicationValue;
    }
}
