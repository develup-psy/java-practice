package com.chap04_control_flow.conditional.level02.normal;

import java.util.Scanner;

public class Application01 {
    /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
     * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
     * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int n = sc.nextInt();
        while(n < 0 || n > 10){
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
