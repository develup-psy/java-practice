package com.control_flow.conditional.level02.normal;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게를 입력해주세요(kg 단위로 입력) : ");
        int weight = sc.nextInt();
        System.out.println("키를 입력해주세요(cm 단위로 입력) : ");
        float height = sc.nextFloat() / 100;

        double bmi = weight / (height * height);
        if(bmi > 30){
            System.out.println("당신은 비만 압니다");
        }else if(bmi > 25){
            System.out.println("당신은 과체중 입니다");
        }else if(bmi > 20){
            System.out.println("당신은 정상체중 입니다");
        }else{
            System.out.println("당신은 저체중 입니다");
        }
//        System.out.println(72 / (1.75 * 1.75));
    }
}
