package org.pltw.examples.makingclasses;

public class TaxArithmetic extends Arithmetic {

    public TaxArithmetic(int a1, int a2) {
        mOperand1 = a1;
        mOperand2 = a2;
    }

    public TaxArithmetic() {
        mOperand1 = 3;
        mOperand2 = 2;
    }

    public double calculateTax(double amt, double rate) {
        return multiply(amt, divide(rate, 100.0));
    }
}
