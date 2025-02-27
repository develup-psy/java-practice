package com.chap13_collection.level01.basic;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application03 {
    public static void main(String[] args) {
        Queue<String> waitingList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("대기 고객 입력(다음 고객으로 넘어가려면 'next', 종료하려면 'exit') : ");
            String inputWaitCtm = sc.nextLine();
            if(inputWaitCtm.equals("exit")) break;
            else if(inputWaitCtm.equals("next")){
                if(waitingList.peek() == null){
                    System.out.println("대기 고객이 없습니다. ");
                    continue;
                }
                System.out.println(waitingList.poll() + " 고객님 차례입니다. ");
            } else{
                waitingList.add(inputWaitCtm);
                System.out.println(inputWaitCtm + " 고객님 대기 등록 되었습니다. ");
            }
        }while(true);
    }
}
