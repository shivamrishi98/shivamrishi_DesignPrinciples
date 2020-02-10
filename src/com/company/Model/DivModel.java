package com.company.Model;

public class DivModel implements CalcModel {
    double divisionValue;
    @Override
    public void result(Double firstNumber, Double secondNumber) {
        divisionValue = firstNumber/secondNumber;
    }

    public double getDivisionValue() {
        return divisionValue;
    }
}
