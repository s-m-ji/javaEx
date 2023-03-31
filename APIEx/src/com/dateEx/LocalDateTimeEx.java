package com.dateEx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {
	public static void main(String[] args) {
		
		/**
		 * Java8부터 날짜, 시간을 나타내는 java.time 패키지를 제공
		 */
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime when = LocalDateTime.of(2020,5,25,22,30,25);
		
		System.out.println(now);
		System.out.println(when);
		
		System.out.println("***********************************");
		System.out.println(".getYear(): " + now.getYear());
		System.out.println(".getMonth(): " + now.getMonth());
		System.out.println(".getMonthValue(): " + now.getMonthValue());
		System.out.println(".getDayOfMonth(): " + now.getDayOfMonth());
		System.out.println(".getHour(): " + now.getHour());
		System.out.println(".getMinute(): " + now.getMinute());

		System.out.println("***********************************");
		LocalDateTime plus = now.plusDays(1).plusMonths(1).plusYears(1);
		System.out.println(now);
		System.out.println(plus);
		
		System.out.println("***********************************");
		System.out.println(".toLocalDate(): " + now.toLocalDate());
		System.out.println(".toLocalTime(): " + now.toLocalTime());
		
		System.out.println("***********************************");
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월/dd일/hh시/mm분/ss초")));
		System.out.println(now.format(DateTimeFormatter.ofPattern("YYYY년/MM월/DD일/HH시/mm분/ss초")));

		System.out.println("***********************************");
		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE)); // 몇번째 주인지 표시
		
		
	}
}























