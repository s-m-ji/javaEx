package com.objectEx;

import java.util.HashMap;

public class objectEx2 {
	public static void main(String[] args) {
		// Key, Value 값 
		/**		 	
		 * 			타입	 타입
		 * HashMap<key, value>
		 * => 값이 중복되는가를 묻기위해 사용함
		 * 
		 * 해쉬맵 선언부
		 * HashMap<String, String> hashMap = new HashMap<>();
		 * 
		 * 동일한 키는 저장될 수 없기에, 이미 존재하는 키를 활용해 담을 경우 덮어쓰기된다
		 * 이전 밸류는 사라지기에 조심쓰
		 * 
		 * 1	무니는
		 * 2	포도강
		 * 3	모꼬시푼뎅
		 */
		HashMap<String, String> hashMap = new HashMap<>();
		
		// 데이터를 담는 방법
		hashMap.put("key", "value");
		hashMap.put("key2", "value2");
		hashMap.put("key", "newValue");
		
		hashMap.put("k1", "무니는");
		hashMap.put("k2", "포도강");
		hashMap.put("k3", "모꼬시푼뎅");
		
		hashMap.put(new String("k4"), "얘, 미뇽앙");
		
		HashMap<Integer, String> hm = new HashMap<>();
		// Integer인데 왜 바로 숫자로 들어갈 수 있느냐? -> 자동형변환이 되었다.
		hm.put(1, " 어떨 것 같닝");
		hm.put(2, " 이런 밍췽날들잉");
		hm.put(3, " 네 하루강 됭다묜말야");
		
		//HashMap hashMap2 = new HashMap<>(); 
		// 이렇게 타입 지정을 안 해도 쓸 수는 있지만 타입 명시를 위해 씁시당
		HashMap<String, String> hashMap2 = new HashMap<>();
		hashMap2.put("1", "너였다면");
		
		
		// 데이터를 꺼내는 방법
		// hashMap.get("key키");
		String str = hashMap.get("key");
		// System.out.println(str);
		// System.out.println("key2: "+ hashMap.get("key2")); // 이렇게 한번에 출력할 수도 있음
		// System.out.println("key3: "+ hashMap.get("key3")); // 만약 없는 걸 출력하면 null이 나옴
		
		System.out.println("k1: "+hashMap.get("k1"));
		System.out.println("k2: "+hashMap.get("k2"));
		System.out.println("k3: "+hashMap.get("k3"));
		System.out.println("k4: "+hashMap.get("k4"));
		
		System.out.println(1 +hm.get(1));
		System.out.println(2 +hm.get(2));
		System.out.println(3 +hm.get(3));
		
		
	}
}
