package com.ohgiraffers.section01.litral;

public class Application1 {

    public static void main(String[] args) {

        //주석
        /*주석*/
        /*
        * 사이 enter 누르면 길게 사용가능
        * */
        //숫자 형태의 값
        //정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.23);


        //문자 형태의 값 출력
        System.out.println('a');    // 문자 형태의 값을 홑다옴표로 감사줘야 한다.
        System.out.println('1');    // 숫자 값이지만 홑다옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
//        System.out.println('ab'); // 두 개 이상은 문자로 취금하지 않기 때문에 에러가 발생한다.
//        System.out.println('');   // 아무 문자도 기록되지 않는 경우도 에러가 발생한다.

        //문자열 형태의 값 출력
        System.out.println("ab");
        System.out.println("안녕하세요"); // 문자 열은 문자 여러개가 나열되 형태를 말하며 쌍따옴표로 감싸줘야 한다.
        System.out.println("123");      // 정수 이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 진다.
        System.out.println("a");        // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다.(문자 a 와는 다르다)

        //논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false); // ture 혹은 false 는 논리형
    }
}
