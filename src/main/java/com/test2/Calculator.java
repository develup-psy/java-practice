package com.test2;

public class Calculator {
    public double divide(double a, double b) throws ZeroException {
        if(b == 0) throw new ZeroException("0으로 나눌 수 없습니다. ");
        return a/b;
    }
}
