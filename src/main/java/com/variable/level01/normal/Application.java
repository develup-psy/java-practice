package com.variable.level01.normal;

public class Application {
    public static void main(String[] args) {
        /*난수 출력*/
        System.out.println(RandomMaker.randomNumber(-100, 50));
        /*랜덤한 대문자 알파벳 출력*/
        System.out.println(RandomMaker.randomUpperAlphabet(10));
        /*가위바위보 랜덤 출력*/
        System.out.println(RandomMaker.rockPaperScissors());
        /*동전 앞뒤 랜덤 출력*/
        System.out.println(RandomMaker.tossCoin());
    }
}
