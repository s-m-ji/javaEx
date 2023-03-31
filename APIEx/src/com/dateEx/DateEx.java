package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		// Date 클래스에서 날짜/시간을 처리하는 방법
		// 기본 생성자를 통해서 Date 객체를 생성하면
		// 현재 시간과 날짜에 대한 정보를 가지고 객체를 생성한다
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now);
		
		// 1970년 1월 1일 00시를 기준으로 밀리 세컨드 단위로 표기된다
		// 한국시간(KST)로 출력될 때는 GMT(그리니치평균시)보다 +9 증가된 시간으로 표시된다.
		Date when = new Date(1);
		System.out.println(when);
		
		when = new Date(1000); // 1초가 지난 시각이 표기됨
		System.out.println(when);
		
		System.out.println("****************************");
		System.out.println(".getTime(): " + now.getTime());
		System.out.println(".getYear(): " + now.getYear() + 1900);
		System.out.println(".getMonth(): " + now.getMonth() + 1);
		System.out.println(".getDay(): " + now.getDay());
		System.out.println(".getDate(): " + now.getDate());
		System.out.println(".getHours(): " + now.getHours());
		System.out.println(".getMinutes(): " + now.getMinutes());
		System.out.println(".getSeconds(): " + now.getSeconds());
		System.out.println(".getTimezoneOffset(): " + now.getTimezoneOffset());
		
		
		/**
		 * => 원하는 형식으로 날짜 출력 가능
		 * y: 년도
		 * M: 월
		 * d: 일
		 * h: 시간
		 * m: 분
		 * s: 초 (S: 1/1000초)
		 * E: 요일
		 * a: am/pm
		 */

		System.out.println("****************************");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss:SSS초 (E) a");

		String formatDate = sdf.format(now);
		System.out.println(formatDate);

		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("E요일 a hh:mm:ss");
		System.out.println(sdf.format(now));
	}
}























