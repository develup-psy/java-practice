package com.chap11_io.level02.normal;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 여러 개의 텍스트 파일을 하나의 파일로 병합하는 프로그램을 작성한다.
        이 때 BufferedReader와 BufferedWriter를 사용하여 작성 */
        Scanner sc = new Scanner(System.in);
        System.out.print("병합할 파일의 개수 입력 : ");
        int copyCount = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[copyCount];
        for (int i = 0; i < copyCount; i++) {
            System.out.print(i + " 번째 파일 이름 입력 : ");
            arr[i] = sc.nextLine();
        }
        System.out.print("병합 될 파일명 입력 : ");
        String resultFileName = sc.nextLine();

       try(BufferedWriter bw = new BufferedWriter(new FileWriter(resultFileName))){
           for (int i = 0; i < copyCount; i++) {
               try(BufferedReader br = new BufferedReader(new FileReader(arr[i]))){
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
               }catch (IOException e){
                   System.out.println("오류 : " + e.getMessage());
               }
           }
           System.out.println("파일 복사가 성공적으로 완료되었습니다. ");
       }catch(IOException e){
           System.out.println("오류 : " + e.getMessage());
       }
    }
}
