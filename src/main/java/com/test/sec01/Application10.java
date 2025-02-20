package com.test.sec01;

/* 10번 문제에 대한 코드 작성 */
public class Application10 {
    public static void main(String[] args) {
        int i=1;
        int j = i++;
        System.out.println(j); //j=1, i=2
        if((i>++j) && (i++ == j)){ //j=1 i=2
            i += j;
        }
        System.out.println(i);
    }
}
