package com.conditional.level04.advanced;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int kScore = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int eScore = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int mScore = sc.nextInt();

        double avg = (kScore + eScore + mScore) / 3;
        boolean isPassed = true;
        if (avg < 60){
            isPassed = false;
            System.out.println("평균 점수 미달로 불합격입니다");
        }
        if (kScore < 40) {
            isPassed = false;
            System.out.println("국어 점수 미달로 불합격입니다");
        }
        if (eScore < 40) {
            isPassed = false;
            System.out.println("영어 점수 미달로 불합격입니다");
        }
        if (mScore < 40) {
            isPassed = false;
            System.out.println("수학 점수 미달로 불합격입니다");
        }

        if(isPassed) System.out.println("합격입니다!");


    }
}
