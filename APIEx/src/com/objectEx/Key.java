package com.objectEx;

public class Key {
	public int number;
	public Key(int number) {
		this.number = number;
	}
	
	public String str;
	
	@Override
	public boolean equals(Object obj) {
		
		// 매개변수 obj가 key로 형변환 가능한지 확인
		if(obj instanceof Key) {
			Key key = (Key)obj;
			 // 가능하면 형변환 number 값 비교
			if(this.number == key.number) {
				return true;
			}
		}
			// 가능하지 않다면 false 리턴
		return false;
		// 마지막에 else로 넣으면 equals메소드의 리턴값이 없기때문에 오류가 난당
	}
	
	// 동일한 숫자값을 반환할 수 있도록 hashCode()도 재정의
	@Override
	public int hashCode() {
		// 객체의 주소값을 숫자로 반환
		// 생성된 객체마다 다른 주소값을 가지고있음
		// super.hashCode();
		// str.hashCode(); -> 타입이 문자열일 경우
		return number;
	}
}
