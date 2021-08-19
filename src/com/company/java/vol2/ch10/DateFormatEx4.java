package com.company.java.vol2.ch10;

import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatEx4 {
    public static void main(String[] args) {

        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        Date inDate = null;
        StringBuilder tempDate = new StringBuilder();
        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력예 : 2015/12/31)");


/*        try {
            tempDate = new StringBuilder(sc.nextLine());
            inDate = df.parse(tempDate.toString());

        } catch (ParseException e) {

            Pattern year = Pattern.compile("\\d{4}"), monthAndDate = Pattern.compile("\\d{1,2}");
            Matcher ym = year.matcher(tempDate.toString()), mdm = monthAndDate.matcher(tempDate.toString());
            tempDate.delete(0, tempDate.length());
            if (ym.find()) {
                tempDate.append(ym.group());
            }
            System.out.println("after ym.find() : " + tempDate);
            while (mdm.find()) {
                tempDate.append("/").append(String.format("%02d", Integer.parseInt(mdm.group())));
            }

            System.out.println("after mdm.find() : " + tempDate);


            try {
                inDate = df.parse(tempDate.toString());
            } catch (Exception ee) {
                System.out.println("입력 오류");
                ee.printStackTrace();
            }

        }*/

        while(sc.hasNextLine()){
            try{
                inDate = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);

        Calendar today = Calendar.getInstance();

        long day = ((cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000));

        System.out.println("입력하신 날짜는 현재와 "+ day + "시간 차이가 있습니다.");
    }
}
