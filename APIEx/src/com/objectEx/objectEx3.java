package com.objectEx;

import java.util.HashMap;

public class objectEx3 {
	public static void main(String[] args) {
		HashMap<Key, String> keyMap = new HashMap<>();
		Key k1 = new Key(1);
		Key k2 = new Key(2);
		Key k3 = new Key(1);
		keyMap.put(k1, "코다라인");
		keyMap.put(k2, "혼네");
		keyMap.put(k3, "킨");
		
		System.out.println("k1.equals(k3): " + k1.equals(k3));
		System.out.println(keyMap.get(k1)); 
		// hashCode()를 오버라이딩해서 리턴을 number로 설정하면 출력값이 코다라인에서 킨이 된다...
		System.out.println(keyMap.get(k2));
		System.out.println(keyMap.get(k3));
	}
	
	public void checkEquals() {
		Key key1 = new Key(1);
		Key key2 = new Key(1);
		
		System.out.println("key1");
		System.out.println(key1.hashCode());
		System.out.println(Integer.toHexString(key1.hashCode()));
		System.out.println(key1.toString());
		System.out.println("*************");
		System.out.println("key2");
		System.out.println(key2.hashCode());
		System.out.println(Integer.toHexString(key2.hashCode()));
		System.out.println(key2.toString());
		System.out.println("*************");
		System.out.println("key1.equals(key2): " + key1.equals(key2));
	}
}
