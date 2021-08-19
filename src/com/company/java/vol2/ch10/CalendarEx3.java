package com.company.java.vol2.ch10;

import java.util.Calendar;

public class CalendarEx3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(0, 0, 0, 10, 20, 30);

        time2.set(0, 0, 0, 20, 30, 10);

        System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시 "
                + time1.get(Calendar.MINUTE) + "분 "
                + time1.get(Calendar.SECOND) + "초 ");

        System.out.println("time1 : " + time2.get(Calendar.HOUR_OF_DAY) + "시 "
                + time2.get(Calendar.MINUTE) + "분 "
                + time2.get(Calendar.SECOND) + "초 ");

        long difference = Math.abs((time2.getTimeInMillis() - time1.getTimeInMillis())/1000);

        System.out.println("time1과 time2의 차이는 " + difference + "초 입니다.");

        StringBuilder temp = new StringBuilder();
        for(int i=0; i < TIME_UNIT.length; i++){
            temp.append(difference / TIME_UNIT[i]).append(TIME_UNIT_NAME[i]);
            difference %= TIME_UNIT[i];
        }
        System.out.println("시분초로 변환하면 " + temp + "입니다.");
    }
}
