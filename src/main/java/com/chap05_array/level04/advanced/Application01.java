package com.chap05_array.level04.advanced;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {
        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */

        //1. 배열로 구현
        int[] lotto = new int[6];

        for(int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1; //0부터 9미만의 값이므로 45를 곱하면 0부터 45미만의 값이고 1을 더해야만 1부터 45의 값이된다.
            for(int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));

//        //2. HashMap으로 구현
//        HashMap<Integer, Boolean> map = new HashMap<>();
//        int[] arr = new int[6];
//        Random r = new Random();
//        for(int i = 0; i < 6; i++) {
//            int num = r.nextInt(1, 46);
//            while(map.containsKey(num)) {
//                num = r.nextInt(1, 46);
//            }
//            map.put(num, true);
//            arr[i] = num;
//        }
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        //2. HashSet로 구현
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0; i < 6; i++) {
//            set.add(arr[i]);
//        }
//        System.out.println(set);
    }
}
