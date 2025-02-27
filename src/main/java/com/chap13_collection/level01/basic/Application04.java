package com.chap13_collection.level01.basic;

import java.util.HashSet;
import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("학생 ID 입력('exit' 입력 시 종료) : ");
            String id = sc.nextLine();
            if(id.equals("exit"))break;
            if(hSet.contains(id)) System.out.println("이미 등록 된 ID 입니다");
            else{
                hSet.add(id);
                System.out.println("ID가 추가되었습니다.");
            }
        }while(true);
        System.out.println("모든 학생의 ID: " + hSet);
    }
}
