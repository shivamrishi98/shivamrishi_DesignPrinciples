package com.company;

import com.company.Controller.CalculationController;
import com.company.Model.AddModel;
import com.company.Model.DivModel;
import com.company.Model.MultiModel;
import com.company.Model.SubModel;
import com.company.Views.CalcView;

public class Main {

    public static void main(String[] args) {
        CalcView theView = new CalcView();
        AddModel theAddModel = new AddModel();
        SubModel theSubModel = new SubModel();
        MultiModel theMultiModel = new MultiModel();
        DivModel theDivModel = new DivModel();

        CalculationController theController = new CalculationController(theView,theAddModel,theSubModel,theMultiModel,theDivModel);
        theView.setVisible(true);
    }
}
