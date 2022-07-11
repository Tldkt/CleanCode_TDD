package Cleancode.demo;

import JavaGrammer.Parent;

//다른 패키지의 자식이 아닌 클래스가 쓰려고 함
public class Test2 {
    public static void main(String[] args) {
        Parent p = new Parent();//객체 생성
        System.out.println(p.d);//마지막 퍼블릭만 사용가능
    }
}
