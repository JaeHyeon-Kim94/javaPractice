package com.company.java.vol1.ch7;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child c = new Child();

        //여러 interface의 default method간의 충돌시 오버라이딩 필수.
        c.method1();

        //default method와 조상 클래스 메서드간의 충돌 => 조상 클래스의 메서드가 호출되고 default method는 무시됨.
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child extends Parent implements MyInterface, MyInterface2 {
    public void method1(){
        System.out.println("method1() in Child");
    }
}

class Parent {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}


