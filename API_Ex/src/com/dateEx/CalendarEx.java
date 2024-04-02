package com.dateEx;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) { 
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH); // 일을 리런
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일을 리턴
		
		String toweek =null;
		switch (week) {
		case Calendar.MONDAY:
			toweek = "월";
			break;
		case Calendar.TUESDAY:
			toweek = "화";
			break;
		case Calendar.WEDNESDAY:
			toweek = "수";
			break;
		case Calendar.THURSDAY:
			toweek = "목";
			break;
		case Calendar.FRIDAY:
			toweek = "금";
			break;
		case Calendar.SATURDAY:
			toweek = "토";
			break;
		case Calendar.SUNDAY:
			toweek = "일";
			break;
		}
	
		int ampm = now.get(Calendar.AM_PM); // 오전/오후 리턴
		String toampm = null;
		if(ampm == Calendar.AM) {
			toampm = "오전";
		} else {
			toampm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR); 
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.println(day+"일");
		
		System.out.print(toweek+"요일 ");
		System.out.println(toampm);
		
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		System.out.println(second+"초");	
	}
}
