package com.chap04_control_flow.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
//        int n = sc.nextInt();
//
//        while(n<2){
//            System.out.print("잘못 입력하셨습니다. 다시 입력하세요 : ");
//            n = sc.nextInt();
//        }
        int n;
        do{
            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            n = sc.nextInt();

            if(n<=2) System.out.println("잘못 입력하셨습니다. 다시 입력하세요. ");
        }while(n <= 2);

        boolean isPrime = true;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime)System.out.println(n + "은 소수이다.");
        else System.out.println(n + "은 소수가 아니다");
    }
}
