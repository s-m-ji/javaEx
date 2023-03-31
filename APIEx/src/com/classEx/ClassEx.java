package com.classEx;

public class ClassEx {
	public static void main(String[] args) {
		// 클래스가 가진 정보를 가져올 수 있음
		// Class clazz = Car.class;
		
		Class clazz;
		try {
			// 해당 경로(패키지를 포함한 클래스명)에 클래스가 존재할 경우 클래스를 반환
			// => 라이브러리가 잘 로드되었는지 확인할 때 사용
			
			clazz = Class.forName("com.classEx.Car");
			// clazz = Class.forName("com.classEx.Car2");
			
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
			System.out.println("*********************");

			// 클래스 경로를 활용하여 리소스 절대경로를 얻어오기
			String path = clazz.getResource("photo1.jpg").getPath();
			System.out.println(path);
			
			// 없는 경우 오류 발생하기에 catch문으로 처리
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 정보를 얻어올 수 없덩");
		}
		
		// String photo1Path = clazz.getResource("photo1.jpg").getPath();
	}
}
