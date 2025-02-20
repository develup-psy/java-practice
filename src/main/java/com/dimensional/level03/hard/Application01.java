package com.dimensional.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가로 행의 수를 입력하세요 : ");
        int rows = scanner.nextInt();
        System.out.print("세로 열의 수를 입력하세요 : ");
        int cols = scanner.nextInt();

        while (!(rows > 0 && rows <= 10) || !(cols > 0 && cols <= 10)) {
            System.out.print("가로 행의 수를 입력하세요 : ");
            rows = scanner.nextInt();
            System.out.print("세로 열의 수를 입력하세요 : ");
            cols = scanner.nextInt();
        }

        char[][] dimenArr = new char[rows][cols];
        Random r = new Random();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                char randomAlpha = (char)r.nextInt('A', 'Z' + 1);
                dimenArr[i][j] = randomAlpha;
            }
        }
        for (int i = 0; i < dimenArr.length; i++) {
            for (int j = 0; j < dimenArr[i].length; j++) {
                System.out.print(dimenArr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
