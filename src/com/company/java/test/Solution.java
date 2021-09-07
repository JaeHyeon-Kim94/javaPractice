package com.company.java.test;

public class Solution {
    public int solution(int N, int[][] road, int K){
        int answer = 0;

        for(int i = 0; i < road.length; i++){
            if(road[i][2]<=K){
                answer++;
            }
        }

        return answer;
    }
}
