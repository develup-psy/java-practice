package com.chap13_collection.level01.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Application06 {
    public static void main(String[] args) {
        HashMap<String, String> dictWordsMap = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit') : ");
            String inputStr = sc.nextLine();
            if(inputStr.equals("exit")) break;
            if(inputStr.equals("search")){
                System.out.println("검색 할 이름 : ");
                String targetName = sc.nextLine();
                if(dictWordsMap.containsKey(targetName)) System.out.println(targetName + " 씨의 전화번호 : "+ dictWordsMap.get(targetName));
                else System.out.println(targetName + "씨의 번호는 등록되어 있지 않습니다. ");
            } else if(!isValidInput(inputStr)){
                System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요");
                continue;
            }
            String[] dictWords = inputStr.split(" ");
            dictWordsMap.put(dictWords[0], dictWords[1]);
            System.out.println("추가 완료 등록 : " + dictWords[0] + " " + dictWords[1]);
        }
    }
    public static boolean isValidInput(String inputStr) {
        return inputStr.matches("^.*\\s\\d{3}-\\d{4}-\\d{4}$");
    }
}
