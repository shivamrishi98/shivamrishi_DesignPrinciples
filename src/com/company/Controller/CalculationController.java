package com.company.Controller;

import com.company.Model.AddModel;
import com.company.Model.DivModel;
import com.company.Model.MultiModel;
import com.company.Model.SubModel;
import com.company.Views.CalcView;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationController {
    private CalcView theView;
    private AddModel theAddModel;
    private SubModel theSubModel;
    private MultiModel theMultiModel;
    private DivModel theDivModel;
    private String st0, st1, st2;
    private double result;


    public CalculationController(CalcView theView, AddModel theAddModel, SubModel theSubModel, MultiModel theMultiModel, DivModel theDivModel) {
        this.theView = theView;
        this.theAddModel = theAddModel;
        this.theSubModel = theSubModel;
        this.theMultiModel = theMultiModel;
        this.theDivModel = theDivModel;
        st0 = "";
        st1 = "";
        st2 = "";
        this.theView.addCalculationListener(new CalculateListener());
    }
    void calcResult(){
       if (st1.equals("+")) {
            theAddModel.result(Double.parseDouble(st0), Double.parseDouble(st2));
            result = theAddModel.getAdditionValue();
        } else if (st1.equals("-")) {
            theSubModel.result(Double.parseDouble(st0), Double.parseDouble(st2));
            result = theSubModel.getSubtractionValue();
        } else if (st1.equals("/")) {
            theDivModel.result(Double.parseDouble(st0), Double.parseDouble(st2));
            result = theDivModel.getDivisionValue();
        } else {
            theMultiModel.result(Double.parseDouble(st0), Double.parseDouble(st2));
            result = theMultiModel.getMultiplicationValue();
        }
    }


    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String s = arg0.getActionCommand();
            if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                if (!st1.equals(""))
                    st2 = st2 + s;
                else
                    st0 = st0 + s;

                theView.setCalculationSolution(st0 + st1 + st2);
            } else if (s.charAt(0) == 'C') {
                st0 = st1 = st2 = "";
                theView.setCalculationSolution(st0 + st1 + st2);
            } else if (s.charAt(0) == '=') {
                calcResult();

                theView.setCalculationSolution(st0 + st1 + st2 + "=" + result);
                st0 = Double.toString(result);

                st1 = st2 = "";
            } else {
                if (st1.equals("") || st2.equals(""))
                    st1 = s;
                else{
                    calcResult();
                    st0 = Double.toString(result);
                    st1 = s;
                    st2 = "";
                }
                theView.setCalculationSolution(st0 + st1 + st2);
            }
        }
    }
}
