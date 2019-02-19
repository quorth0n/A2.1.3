package org.pltw.examples.makingclasses;

public class TaxArithmetic extends Arithmetic {

    public TaxArithmetic(double a1, double a2) {
        //this.mOperand1 = a1;
        //this.mOperand2 = a2;
    }

    public TaxArithmetic() {
        //mOperand1 = 3;
        //mOperand2 = 2;
    }

    public double calculateTax(double amt, double rate) {
        return 1.0;//multiply(amt, divide(rate, 100.0));
    }

    public double calculateTax(double taxRate) {
        //int purchaseAmount = this.mOperand1 + this.mOperand2; // return purchase amount
        //taxRate = new TaxArithmetic(taxRate, 100.0).divide(); // calculate tax rate as double
        //return new TaxArithmetic(purchaseAmount, taxRate).multiply(); // multiply tax rate * purchase amount to return price after tax
        return 1.0;
    }

}
