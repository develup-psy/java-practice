package com.chap13_collection.level01.basic;

import java.util.*;

public class Application05 {
    public static void main(String[] args) {
        ArrayList<String> dictWordsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("단어 입력 ('exit' 입력 시 종료) : ");
            String word = sc.nextLine();
            if(word.equals("exit"))break;
            dictWordsList.add(word);
        }while(true);
        Collections.sort(dictWordsList);
        System.out.println("정렬된 단어" + dictWordsList);
    }
}
