package com.company.java.vol1.ch7;

public class InnerEx6 {
    //익명 클래스
    // 클래스의 선언과 객체의 생성을 동시에
    // 조상클래스의 이름이나 구현하고자 하는 인터페이스의 이름을 사용해 정의
    // 하나의 상속 혹은 하나의 인터페이스 구현만이 가능.
    Object iv = new Object(){ void method(){ } };
    static Object cv = new Object(){ void method(){ } };

    void myMethod(){
        Object lv = new Object() { void method() { } };
    }
}
