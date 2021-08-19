package com.company.java.vol1.ch7;

/*
public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        //1. 조상 클래스의 멤버변수와 같은 이름의 인스턴스 변수를 자손 클래스에 중복으로 정의했을 때
        //조상 타입의 참조변수로 자손 인스턴스를 참조하는 경우
        System.out.println("p.x = " + p.x);

        p.method();
        //2. 조상 클래스의 멤버변수와 같은 이름의 인스턴스 변수를 자손 클래스에 중복으로 정의했을 때
        //자손 타입의 참조변수로 자손 인스턴스를 참조하는 경우
        //1과 2는 다른 결과.
        System.out.println("c.x + " + c.x);

        //하지만 메서드의 경우에는 참조변수의 타입과 관계 없이 실제 인스턴스의 메서드가 호출됨.
        c.method();
    }
}

class Parent{
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}
    class Child extends Parent{
        int x = 200;

        void method(){
            System.out.println("Child Method");
        }

}*/
