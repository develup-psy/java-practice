package com.chap06_class_and_object.level01.basic.student.model.dto;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    /* 기본 생성자 */
    public StudentDTO() {
    }

    /* 모든 필드를 초기화하는 생성자 */

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    /* Student 정보 출력 메서드 */
    public void getInformation(){
        int avg = (kor + eng + math) / 3;
        System.out.printf("학년=%d, 반=%d, 이름=%s, 국어=%d, 영어=%d, 수학=%d, 평균=%d", grade, classroom, name, kor, eng, math, avg);
        System.out.println();
    }

    /* Studnet의 setter/getter */
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
