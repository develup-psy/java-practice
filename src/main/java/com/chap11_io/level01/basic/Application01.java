package com.chap11_io.level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요: ");
        String fileName = sc.nextLine();

        try(FileReader fis = new FileReader(fileName)){
            int ch;
            while((ch = fis.read())!= -1){
                System.out.print((char)ch);
            }

        }catch (IOException e){
            System.out.println("해당 이름을 가진 파일이 없습니다. ");
        }
    }
}
