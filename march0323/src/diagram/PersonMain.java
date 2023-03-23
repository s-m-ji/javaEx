package diagram;

public class PersonMain {

	public static void main(String[] args) {
		
		new Person(); // 객체 생성 ※객체가 생성될 때 생성자가 실행됩니다.
		Person saram1 = new Person(); // 사용하기 위해 변수명 지정
		Person saram2 = new Person("샐리", 10, 130.5, 40.1);
		
		System.out.println(saram1.information());
		System.out.println(saram2.information());
		
		Person[] personArr = new Person[5];
		personArr[0] = new Person("스누피", 5, 0, 0);
		// personArr[0] = new Person("찰리", 6, 0, 0); // 이렇게 쓸 경우에는 [0]을 덮어쓰기
		personArr[1] = new Person("찰리", 6, 0, 0);
		personArr[2] = new Person("샐리", 5, 0, 0);
		personArr[3] = new Person("도로시", 6, 0, 0);
		personArr[4] = new Person("브라이언", 4, 0, 0);
		
		// for(타입 변수명 : 배열){}
		for(Person p : personArr) {
			System.out.println(p.information());
			System.out.println("=================");
		}
		
	}

}
