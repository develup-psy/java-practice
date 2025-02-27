package com.test2;

public class Exam01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try{
            calculator.divide(1.0,0);
        }catch(ZeroException e){
            e.printStackTrace();
        }
    }
}
