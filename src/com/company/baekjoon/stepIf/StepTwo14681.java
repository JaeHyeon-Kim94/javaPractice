package com.company.baekjoon.stepIf;

import java.util.Scanner;

public class StepTwo14681 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        int quadrant=0;
        if(x>0){
            if(y>0){
                quadrant=1;
            }else if(y<0){
                quadrant=4;
            }
        }else if(x<0){
            if(y>0){
                quadrant=2;
            }else if(y<0){
                quadrant=3;
            }
        }
        System.out.println(quadrant);
        sc.close();
    }
}
