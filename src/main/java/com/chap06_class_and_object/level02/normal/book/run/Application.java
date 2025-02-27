package com.chap06_class_and_object.level02.normal.book.run;

import com.chap06_class_and_object.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        /* 1. 기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력*/
        BookDTO bookDTO = new BookDTO();
        bookDTO.printInformation();

        /* 2. 필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력 */
        BookDTO bookDTO2 = new BookDTO("f1이란?", "beyond 출판사", "건햄");
        bookDTO2.printInformation();

        /* 3. 모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력 */
        BookDTO bookDTO3 = new BookDTO("에임핵 사냥꾼", "beyond 출판사", "양하햄", 20000, 9.9);
        bookDTO3.printInformation();
    }
}
