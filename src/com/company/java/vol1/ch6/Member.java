package com.company.java.vol1.ch6;

public class Member {
    void instanceMethod() { };
    static void staticMethod() { };

    void instanceMethod2() {
        instanceMethod();
        staticMethod();
    }

    static void staticMethod2(){
        //instanceMethod();
        //Non-static method 'instanceMethod()' cannot be referenced from a static context
        /*
        같은 클래스에 속한 멤버(변수+메서드)간에는 별도의 인스턴스를 생성하지 않고도 서로 참조 혹은 호출이 가능.
        but, 클래스멤버가 인스턴스 멤버를 참조 또는 호출하고자 하는 경우에는 인스턴스를 생성해야 하는데,
        인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만,
        클래스 멤버가 존재하는 시점에는 인스턴스 멤버가 존재하지 않을 수도 있기 때문.
         */
        staticMethod();
    }
}
