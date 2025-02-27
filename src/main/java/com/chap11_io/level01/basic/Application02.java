package com.chap11_io.level01.basic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String originName = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String copyName = sc.nextLine();

        try(FileReader fr = new FileReader(originName); FileWriter fw = new FileWriter(copyName)) {
            int ch;
            while((ch = fr.read()) != -1){
                fw.write(ch);
            }
            System.out.println("파일 복사가 성공적으로 완료 되었습니다. ");
        }catch(IOException e){
            System.out.println("오류 : " + originName + "(지정된 파일을 찾을 수 없습니다)");
        }
    }
}
