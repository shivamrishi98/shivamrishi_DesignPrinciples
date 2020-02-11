package com.company.Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalcView extends JFrame {


    private JTextField calculationSolution = new JTextField(10);
    private JButton button0 = new JButton("0");
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");

    private JButton button_equal = new JButton("=");


    private JButton button_add = new JButton("+");
    private JButton button_sub = new JButton("-");
    private JButton button_divide = new JButton("/");
    private JButton button_multiply = new JButton("*");
    private JButton beq = new JButton("C");

    private JButton button_dot = new JButton(".");

    JPanel addToPanel(JPanel calculatorPanel) {
        calculatorPanel.add(calculationSolution);
        calculatorPanel.add(button_add);
        calculatorPanel.add(button1);
        calculatorPanel.add(button2);
        calculatorPanel.add(button3);
        calculatorPanel.add(button_sub);
        calculatorPanel.add(button4);
        calculatorPanel.add(button5);
        calculatorPanel.add(button6);
        calculatorPanel.add(button_multiply);
        calculatorPanel.add(button7);
        calculatorPanel.add(button8);
        calculatorPanel.add(button9);
        calculatorPanel.add(button_divide);

        calculatorPanel.add(button_dot);
        calculatorPanel.add(button0);

        calculatorPanel.add(beq);
        calculatorPanel.add(button_equal);

        calculatorPanel.setBackground(Color.red);
        return calculatorPanel;
    }

    public CalcView() {
        JPanel calculatorPanel = addToPanel(new JPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(330, 435);
        setCalculationSolution("");
        this.add(calculatorPanel);
    }
    public void setCalculationSolution(String solution) {
        calculationSolution.setText(solution);
    }

    public void addCalculationListener(ActionListener calculationController) {
        button_add.addActionListener(calculationController);
        button_multiply.addActionListener(calculationController);
        button_divide.addActionListener(calculationController);
        button_sub.addActionListener(calculationController);
        button_dot.addActionListener(calculationController);
        button_equal.addActionListener(calculationController);
        button0.addActionListener(calculationController);
        button1.addActionListener(calculationController);
        button2.addActionListener(calculationController);
        button3.addActionListener(calculationController);
        button4.addActionListener(calculationController);
        button5.addActionListener(calculationController);
        button6.addActionListener(calculationController);
        button7.addActionListener(calculationController);
        button8.addActionListener(calculationController);
        button9.addActionListener(calculationController);
        beq.addActionListener(calculationController);
    }

}
