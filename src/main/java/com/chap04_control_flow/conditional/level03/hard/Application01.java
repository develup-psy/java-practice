package com.chap04_control_flow.conditional.level03.hard;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");

        int n1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");

        int n2 = sc.nextInt();
        System.out.print("연산 기호를 입력하세요 : ");
        sc.nextLine();
        String op = sc.nextLine();

        int result = switch(op){
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            case "%" -> n1 % n2;
            default -> Integer.MAX_VALUE;
        };

        if(result == Integer.MAX_VALUE){
            System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");
        }else{
            System.out.printf("%d %s %d = %d", n1, op, n2, result);
        }
    }
}
