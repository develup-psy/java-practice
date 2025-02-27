package com.chap13_collection.level01.basic;

import java.util.*;

public class Application02 {
    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String url;
        do{
            System.out.print("방문 URL을 입력해주세요 : ");
            url = sc.nextLine();
            if(url.equals("exit")) break;
            linkedList.add(url);
            System.out.println(linkedList);
        }while(true);

    }
}
