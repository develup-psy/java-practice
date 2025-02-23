package com.chap04_control_flow.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sb.append(i % 2 != 0 ? "수" : "박");
        }
        System.out.println(sb.toString());
    }
}
