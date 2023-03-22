package practice;


public class ExMain {
	public static void main(String[] args) {
		/*
		member.name = "이름";
		member.age = 10;
		System.out.println(member.age);
		System.out.println(member.name);
		
		String[] newA = new String[10];
		String[] oldA = {"가", "나", "다", "라", "마", "바", "사"};
		
		System.arraycopy(oldA, 0, newA, 0, oldA.length);
		System.out.println(newA[0]);
		
		for(String a : newA) {
			System.out.println(a);
		}
		*/
		
		Ex[] Arr = new Ex[5];
		Arr[0] = new Ex("게시글1", "내용", "날짜", 1);
		Arr[1] = new Ex("게시글2", "내용", "날짜", 2);
		Arr[2] = new Ex("게시글3");
		Arr[3] = new Ex("게시글4");
		Arr[4] = new Ex("게시글5");
		
		System.out.println("===== 게시글을 출력합니다 =====");
		for(Ex Ex : Arr) {
			System.out.printf("%s, %s, %s, %d\n", Ex.name, Ex.id, Ex.password, Ex.age);
		}
	}
}
