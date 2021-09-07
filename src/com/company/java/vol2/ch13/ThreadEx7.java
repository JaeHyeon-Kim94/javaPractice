package com.company.java.vol2.ch13;

import javax.swing.*;
//ThreadEx6을 멀티쓰레드로 구현. 구현한 run( ) 이 아닌 start( )를 호출했음에 주목. Runnable을 implements 하는 것과 Thread를 extends 차이.
//class ThreadEx7_1 extends Thread {
class ThreadEx7_1 implements Runnable {
    public void run(){
        for(int i = 10 ; i > 0 ; i--){
            System.out.println(i);

            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
}

public class ThreadEx7 {
    public static void main(String[] args) {
        ThreadEx7_1 th1 = new ThreadEx7_1();
        //th1.start();
        Thread t1 = new Thread(th1); t1.start();


        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + " 입니다.");

    }
}
