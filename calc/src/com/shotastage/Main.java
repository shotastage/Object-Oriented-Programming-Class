package com.shotastage;

public class Main {

    public static double value = 0;


    void plus(double num) {
        value = value + num;
    }

    void minus(double num) {
        value = value - num;
    }

    void times(double num) {
        value = value*num;
    }

    void divide(double num) {
        value = value/num;
    }


    double getValue() {
        return value;
    }



    public static void main(String[] args) {
        Main c = new Main();

        c.plus(3); // +3
        c.minus(1); // -1
        c.times(5.5); //
        c.divide(2);
        System.out.println("現在の値:"+c.getValue());//現在の値を出力
    }
}
