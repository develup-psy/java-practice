package com.chap03_method_and_api.level02.normal;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max){
//        Random random = new Random();
//        return random.nextInt(min, max);
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    public static String randomUpperAlphabet(int length){
//        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char)randomNumber('A','Z'));
        }
        return sb.toString();
    }
    public static String rockPaperScissors(){
        int randomNumber = (int)(Math.random() * 3);
        return randomNumber == 0 ? "가위" : randomNumber == 1 ? "바위" : "보";
    }
    public static String tossCoin(){
        Random random = new Random();
        return random.nextInt(0, 2) == 0 ? "앞" : "뒤";
    }
}
