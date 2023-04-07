package sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 s초");
		String str = sdf.format(now);
		System.out.println(str);
		
		
		Calendar noww = Calendar.getInstance();
		int y = noww.get(Calendar.YEAR);
		int m = noww.get(Calendar.MONTH)+1;
		String s = (m<10)?("0"+m) :(""+m);
		
		int d = noww.get(Calendar.DAY_OF_WEEK);
		String dArr[] = {"일", "월", "화", "수", "목", "금", "토"};
		String ss = dArr[d-1] + "요일"; 
		
		int h = noww.get(Calendar.HOUR_OF_DAY);
		String sss = (h<10)?("0"+h):(""+h);
		
		System.out.printf("%d년 %s월 %s %s시", y,s,ss,sss);
	}

}
