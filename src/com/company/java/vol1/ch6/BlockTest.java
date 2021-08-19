package com.company.java.vol1.ch6;
//초기화 블럭은 모든 생성자에서 공통적으로 수행돼야 하는 코드를 넣는데 사용함.
public class BlockTest {
    static {
        //클래스 초기화 블럭은 클래스가 메모리에 처음 로딩될 때 한번만 수행.
        //초기화 순서 : 기본값 -> 명시적초기화 -> 클래스 초기화 블럭
        System.out.println("static { }");
    }
    {
        //인스턴스 초기화 블럭은 인스턴스를 생성할 때마다 수행.
        //초기화 순서 : 기본값 -> 명시적초기화 -> 인스턴스 초기화 블럭 -> 생성자
        System.out.println("{ }");
    }

    public BlockTest(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlcokTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }
}