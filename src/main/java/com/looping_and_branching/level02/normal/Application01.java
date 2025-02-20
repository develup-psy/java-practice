package com.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        int i=0;
        for(char c: str.toCharArray()){
            System.out.println(i + " : " + c);
            i++;
        }
    }
}
