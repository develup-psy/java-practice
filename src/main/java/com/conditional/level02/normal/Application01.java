package com.conditional.level02.normal;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int n = sc.nextInt();
        while(n > 10){
            System.out.println("1 ~ 10 사이의 숫자를 입력해주세요");
            n = sc.nextInt();
        }
        if(n % 2 == 0){
            System.out.println(n + "은 짝수입니다.");
        }else{
            System.out.println(n + "은 홀수입니다. ");
        }
    }
}
