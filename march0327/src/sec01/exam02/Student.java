package sec01.exam02;

// 자식 클래스에서 부모 클래스를 정의함
public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		// 부모의 생성자를 호출
		// 매개변수로 입력된 값을 받아서 부모생성자를 호출합니다.
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	// Object(부모)가 기존에 가지고 있던 메소드를 재정의하여 사용.
	// 오브젝트는 최상위 클래스로서 누구나 부모로 삼을 수 있다앙
	public String toString() {
		return name +" / "+ ssn +" / "+ studentNo;
	}
	
	
	// @Override는 메소드가 오버라이드 하고 있음을 알려주는 표시
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
}
