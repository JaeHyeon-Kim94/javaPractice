package com.company.ch6;
//재귀함수는 매개변수의 복사와 복귀지점 위치 저장 등 수행시간 측면에서 비효율적이나,
//로직이 복잡해질수록 반복문보다 가독성 측면에서 이점이 있으므로 선택해서 사용하면 됨.
public class FactorialTest2 {
    int test = 0;

    public static void main(String[] args) {
        long n = 35;
        System.out.println(n+"! = " + factorial(n));
    }

    static long factorial(long n){
        /*
        FactorialTest2 fc2 = new FactorialTest2();
        System.out.println(fc2.test);
        //클래스 메서드는 인스턴스 변수를 사용할 수 없다.(?)  => MyMathTest2.java

        FactorialTest2.test;
        //Non-static field 'test' cannot be referenced from a static context
        */
        if(n==1) return 1;
        return n*factorial(n-1);


    }
}
