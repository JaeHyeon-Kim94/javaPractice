package com.company.java.vol1.ch5;
/*
* 16진수를 2진수로 변환하는 예제.
* 변환하고자 하는 16진수를 배열 hex에 나열하고
* 16진수의 문자 부분을 char array로 처리
* 배열 binary에는 이진수의 16개 값을 문자열로 저장.
* for문을 이용해서 배열 hex에 저장된 문자를 하나씩 읽어서
* 그에 해당하는 이진수 표현을 배열 binary에서 얻어 result에 덧붙이고
* 그 결과를 화면에 출력.
* */
public class ArrayEx13 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E' };

        String[] binary = {"0000", "0001", "0010", "0011",
                        "0100", "0101", "0110", "0111",
                        "1000", "1001", "1010", "1011",
                        "1100", "1101", "1110", "1111"};
        String result = "";

        for (int i = 0; i < hex.length; i++) {
            if (hex[i] >= '0' && hex[i] <= '9') {
                //'8'-'0'은 8이 됨.(유니코드가 나열되어있는 점을 이용)
                result += binary[hex[i] - '0'];
            } else {
                //여기서 char - char + 10은 16진수를 10진수로 변환하여 binary[] 이용해 2진수로 변환하는 것.
                result += binary[hex[i] - 'A' + 10];
            }
        }

        System.out.println("hex:" + new String(hex));
        System.out.println("binary:" + result);
    }
}
