package com.company.Model;

public class SubModel implements CalcModel {
    double subtractionValue;
    @Override
    public void result(Double firstNumber, Double secondNumber) {
        subtractionValue = firstNumber-secondNumber;
    }

    public double getSubtractionValue() {
        return subtractionValue;
    }
}
