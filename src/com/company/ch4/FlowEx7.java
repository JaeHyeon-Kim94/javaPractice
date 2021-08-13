package com.company.ch4;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random()*3 + 1);

        switch(com-user){
            case 2: case -1:
                System.out.println("당신이 이겼어요.");
                break;
            case -2: case 1:
                System.out.println("당신이 졌어요.");
                break;
            case 0:
                System.out.println("비겼어요.");
        }
    }
}
