package com.looping_and_branching.level04;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        System.out.print("숫자를 입력하세요 : ");
        int pushNum = sc.nextInt() % 26;

        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if (ch == ' '){
                result.append(ch);
                continue;
            }

            if(ch >= 'A' && ch <= 'Z'){
                if(ch + pushNum > 'Z'){
                    result.append( (char)((ch + pushNum) % ('Z' + 1) + 'A'));
                }else{
                    result.append((char)(ch + pushNum));
                }
            }else{
                if(ch + pushNum > 'z'){
                    result.append((char)((ch + pushNum) % ('z' + 1) + 'a'));
                }else{
                    result.append((char)(ch + pushNum));
                }
            }
        }
        System.out.println(result);
    }
}
