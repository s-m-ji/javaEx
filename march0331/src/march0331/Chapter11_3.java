package march0331;

import java.util.HashMap;

public class Chapter11_3 {
	private String studentNum;
	
	public int number;
	
	public Chapter11_3(int number) {
		this.number = number;
	}

	public Chapter11_3(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	
	public static void main(String[] args) {
		// Chapter11_3 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Chapter11_3, String> hMap = new HashMap<Chapter11_3, String>();
		
		// new Chapter11_3("1")의 점수 95를 저장
		hMap.put(new Chapter11_3("1"), "95");
		
		String score = hMap.get(new Chapter11_3("1"));
		System.out.println("1번 학생의 총점: " + score);
	}
}















