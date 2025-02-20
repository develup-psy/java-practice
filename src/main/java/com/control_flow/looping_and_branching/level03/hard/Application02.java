package com.control_flow.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        int random = (int)(Math.random()*100);
        int count = 1;
        while(random != n){
            if (random < n) System.out.println("입력하신 정수보다 작습니다.");
            else System.out.println("입력하신 정수보다 큽니다.");
            count++;

            System.out.print("정수를 입력하세요 : ");
            n = sc.nextInt();
        }
        System.out.printf("정답입니다. %d만에 정답을 맞추셨습니다",count);
    }
}
