package com.company.java.vol1.ch9;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? " + (i == i2));             //false. 서로 다른 참조값을 가진 인스턴스 참조변수임.
        System.out.println("i.equals(i2) ? " + i.equals(i2));   //true. equals method가 overiding 돼있음,(==String. !=StringBuffer)
        System.out.println("i.compareTo(i2)="+i.compareTo(i2)); //0. 동일 유무 뿐만 아니라 대소비교까지 가능.
        System.out.println("i.toString() = " + i.toString());   //string 형식으로 출력

        System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("MIN_VALUE+"+Integer.MIN_VALUE);
        System.out.println("SIZE + " + Integer.SIZE +" bits");
        System.out.println("BYTES="+Integer.BYTES+" bytes");
        System.out.println("TYPE="+Integer.TYPE);
    }
}
