package com.chap06_class_and_object.level01.basic.student.run;

import com.chap06_class_and_object.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] studentDTO = new StudentDTO[10];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String isMore = "y";
        int i = 0;
        while (isMore.equals("y") || isMore.equals("Y")) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classRoom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            studentDTO[i] = new StudentDTO(grade, classRoom, name, kor, eng, math);

            System.out.print("계속 추가하실 겁니까?(y/n): ");
            sc.nextLine();
            isMore = sc.nextLine().trim();
            i++;
            count++;
        }
        for (int j = 0; j < count; j++) {
            studentDTO[j].getInformation();
        }
    }
}
