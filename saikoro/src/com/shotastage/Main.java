package com.shotastage;


import java.util.Random;
import java.lang.Exception;


public class Main {

    public static int num = 6;

    Main(int num) throws Exception {
        if ( num < 1 ) {
            throw new Exception("Dice number needs more than one.");
        }
    }


    Random t = new java.util.Random();
    int max = num;
    int value;


    void roll() {
        value = t.nextInt(max) + 1;
    }

    int getValue() {
        return  value;
    }


    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++){
            Main n = new Main(num);
            n.roll();

            int number = n.getValue();


                System.out.println(number);

        }
    }
}
