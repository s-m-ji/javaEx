package getter.setter;

import java.util.Calendar;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("123456", "서솔");
		// 상수 필드의 값을 변경할 수 없다.
		// p.NATION = "한국"; // 초기값=최종값을 바꾸려고해서 오류가 생김
		p.name = "서솔";
		System.out.println("파이: " + Person.PI);
		System.out.println("지구 반지름: " + Person.EARTH_RADIUS + "km");
		System.out.println();
		
		// 싱글톤 패턴은 아니지만 함 활용해보기였다고...
		Calendar cal = Calendar.getInstance();
		
		// 오늘이 며칠인지 출력
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int day2 = cal.get(5);
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		System.out.println("값을 새로 입력해도? "+day2+"일");
		
		System.out.println();
		
		System.out.print(Calendar.HOUR_OF_DAY+"시 ");
		System.out.print(Calendar.MINUTE+"분 ");
		System.out.print(Calendar.SECOND+"초 ");
		
		// 추가 예시) 속도 구할 때 after-before하면 작업에 걸린 시간을 알 수 있음
		long before = System.currentTimeMillis();
		long after = System.currentTimeMillis();
		}

}
