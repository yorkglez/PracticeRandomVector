package com.practicerandomvector.app;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Declarations
        int vectorNumbers[] = new int[100];

        //Implements Random
        Random random = new Random();

        //Process
        for (byte i = 0; i < 100; i++){
            vectorNumbers[i] = random.nextInt(900);
        }
        //Output numbers of vector
        for (byte i = 0; i < 100; i++){
            System.out.println(vectorNumbers[i]);
        }
    }
}
