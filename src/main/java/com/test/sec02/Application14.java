package com.test.sec02;

import java.util.Arrays;

/* 14번 문제에 대한 코드 작성 */
public class Application14 {
    void doStuff(int x) {
        System.out.print("doStuff x = " + (x++)); //
    }
    public static void main(String[] args) {
        int x = 5;
        Application14 p = new Application14();
        p.doStuff(x); //지역변수 x에 대한 리터럴 값을 인자로 복사해서 전달하는 것이다.
        System.out.print("main x = " + x); //따라서 x의 변수에 저장된 리터럴 값은 변경되지 않는다.

    }
}
