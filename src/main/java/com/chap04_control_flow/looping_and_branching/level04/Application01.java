package com.chap04_control_flow.looping_and_branching.level04;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        System.out.print("숫자를 입력하세요 : ");
        int mod = sc.nextInt() % 26;

        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)((ch+mod-'a') % 26 + 'a');
            }else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)((ch+mod-'A') % 26 + 'A');
            }
            result.append(ch);
        }
        System.out.println(result);
    }
}
