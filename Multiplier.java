package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {
    private int x;
    private int y;
    private double z;
    private double q;
    BigDecimal b1 = new BigDecimal("5.99");
    BigDecimal b2 = new BigDecimal("4.6");
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public Multiplier(int x, int y, double z, double q, ArrayList<Integer> list) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.q = q;
        this.list = list;
    }

    public int multiply (int x, int y) {
        return x * y;
    }

    public int multiply (int x, int y, int z, int q) {
        return x * y * z * q;
    }

    public double multiply (double x, double y) {
        return x * y;
    }

    public static void main (BigDecimal b1, BigDecimal b2) {
        BigDecimal b3 = b1.multiply(b2);
        System.out.println("Multiplication is" + b3);
    }
}
