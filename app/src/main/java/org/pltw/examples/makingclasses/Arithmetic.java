package org.pltw.examples.makingclasses;

public class Arithmetic {
    private int mOperand1;
    private int mOperand2;

    public Arithmetic(){
        mOperand1 = 2;
        mOperand2 = 3;
    }
    public Arithmetic(int a1, int a2) {
        mOperand1 = a1;
        mOperand2 = a2;
    }

    public String toString() {
        return "Arithmetic Instance:  mOperand1 = " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }

    public int add() {
        return mOperand1 + mOperand2;
    }
    public int subtract() {
        return mOperand1 - mOperand2;
    }
    public int multiply() {
        return mOperand1 * mOperand2;
    }
    public double divide() {
        return (double) mOperand1 / (double) mOperand2;
    }

    public static int add(int operand1, int operand2){
        return operand1 + operand2;
    }
    public static int subtract(int operand1, int operand2){
        return operand1 + operand2;
    }
    public static int multiply(int operand1, int operand2){
        return operand1 + operand2;
    }
    public static int divide(int operand1, int operand2){
        return operand1 + operand2;
    }
}
