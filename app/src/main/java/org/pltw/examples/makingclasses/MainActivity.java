package org.pltw.examples.makingclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Arithmetic testArithmetic = new Arithmetic();
        TaxArithmetic testTax = new TaxArithmetic();

        // System.out.println(testArithmetic);
        System.out.println(testTax.calculateTax(100, 9)); // 9
        System.out.println(new TaxArithmetic(100, (int) new TaxArithmetic(9, 100).divide())); // also 9
    }
}
