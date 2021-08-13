package com.company.ch4;

//이름 붙은 반복문
public class FlowEx33 {
    public static void main(String[] args) {
        Loop1:
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5)
//                    break Loop1;
                    //Loop1 반복문의 종료.
//                    break;
                    //j 반복문의 종료
//                    continue Loop1;
                    //j가 5가 됐을 때 Loop1 반복문의 재개
//                    continue;
                    //j가 5가 됐을 때 j 반복문 재개
                System.out.println(i + "*" + j + "=" + i * j);
            }//end of for i
            System.out.println();
        }//end of Loop1
    }
}
