package com.chap13_collection.level01.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        ArrayList<Integer> classScoreList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        char isMore;
        do{
            System.out.print("학생 성적 : ");
            int score = sc.nextInt();
            classScoreList.add(score);
            System.out.print("추가 입력하실건까요?(Y/N) : ");
            isMore = sc.next().trim().charAt(0);
        }while(isMore == 'y' || isMore == 'Y');

        System.out.println("학생 인원 : " + classScoreList.size());

        double sum = 0;
        for(Integer score : classScoreList) {
            sum += score;
        }
        System.out.println("평균 점수 : " + (sum / classScoreList.size()));
    }
}
