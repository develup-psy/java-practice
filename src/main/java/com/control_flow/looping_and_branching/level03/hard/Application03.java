package com.control_flow.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        System.out.print("문자 입력 : ");
        char target = sc.next().charAt(0);

        int count = 0;
        boolean isChar = true;
        for(char ch : str.toCharArray()){
            if(ch == target)count++;
            if(!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')){
                isChar = false;
                break;
            }
        }
        if(!isChar){
            System.out.println("영문자가 아닌 문자가 포함되어 있습니다");
        }else{
            System.out.println(target + "이 포함된 갯수 : " + count);
        }
    }
}
