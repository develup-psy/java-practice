package com.greedy.level01.normal;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(min, max);
    }
    public static String randomUpperAlphabet(int length){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char)random.nextInt('A', 'Z'));
        }
        return sb.toString();
    }
    public static String rockPaperScissors(){
        Random random = new Random();
        switch (random.nextInt(0, 3)){
            case 0:
                return "바위";
                case 1:
                    return "보";
                    case 2:
                        return "가위";
        }
        return "에러";
    }
    public static String tossCoin(){
        Random random = new Random();
        return random.nextInt(0, 2) == 0 ? "앞" : "뒤";
    }
}
