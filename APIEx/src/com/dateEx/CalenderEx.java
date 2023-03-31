package com.dateEx;

import java.util.Calendar;

public class CalenderEx {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH); // ~일 리턴
		int week = now.get(Calendar.DAY_OF_WEEK); // ~요일 리턴
		int ampm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(ampm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		switch (week) {
		case Calendar.SUNDAY:
			System.out.println("日");
			break;
		case Calendar.MONDAY:
			System.out.println("月");
			break;
		case Calendar.TUESDAY:
			System.out.println("火");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("水");
			break;
		case Calendar.THURSDAY:
			System.out.println("木");
			break;
		case Calendar.FRIDAY:
			System.out.println("金");
			break;
		case Calendar.SATURDAY:
			System.out.println("土");
			break;
		default:
			break;
		}
		
		
		if(ampm == Calendar.AM) {
			System.out.println("午前");
		} else {
			System.out.println("午後");
		}
	}
}




















