package com.company;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

public class Adder {
    private BigDecimal sum;
    private int a;
    private int b;
    private ArrayList<BigDecimal> list = new ArrayList<BigDecimal>();

public Adder (int a, int b, ArrayList<BigDecimal> list) {
    this.a = a;
    this.b = b;
    this.list = list;
}

    public int add (int a, int b) {
        return a + b;
    }

    public Adder (String[] args) {
    BigDecimal sum;
        BigDecimal bd1 = new BigDecimal("-3.29");
        BigDecimal bd2 = new BigDecimal("1.9");
        MathContext mc = new MathContext(10);
    sum = bd1.add(bd2,mc);
        System.out.println("The sum of\n" + bd1 + "\nand\n" + bd2 + " " + "\nis\n" + sum + "\n");
    }
}