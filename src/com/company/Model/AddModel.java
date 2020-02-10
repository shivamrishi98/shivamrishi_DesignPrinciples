package com.company.Model;

public class AddModel implements CalcModel {
    double additionValue;
    @Override
    public void result(Double firstNumber,Double secondNumber){
        additionValue = firstNumber+secondNumber;
    }
    public double getAdditionValue(){
        return additionValue;
    }
}
