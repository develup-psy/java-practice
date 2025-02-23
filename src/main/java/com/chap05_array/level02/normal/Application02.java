package com.chap05_array.level02.normal;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Application02 {
    public static void main(String[] args) {
        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요(예: 990101-1234567 ): ");
        String str = sc.nextLine();
        while(!isValidResidentNumber(str)){
            System.out.print("주민등록번호를 다시 형식에 맞춰 입력하세요(예: 990101-1234567 ): ");
            str = sc.nextLine();
        }

        //(1) 문자 배열 저장
        final int maskStartIndex = 8;
        StringBuilder result = new StringBuilder();
        int i=0;
        for(char ch : str.toCharArray()){
            if(i>=maskStartIndex)result.append("*");
            else result.append(ch);
            i++;
        }
        System.out.println(result);

        //(2) String.replaceAll 사용
        System.out.println(maskResidentNumber(str));
    }
    static boolean isValidResidentNumber(String number) {
        String regex = "^[0-9]{6}-[0-9]{7}$";
        return Pattern.matches(regex,number);
    }
    static String maskResidentNumber(String number) {
        return number.replaceAll("-(\\d)\\d{6}","-$1******");
    }
}
