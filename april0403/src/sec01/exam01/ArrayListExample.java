package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("스누피");
		list.add("찰리");
		list.add("루시");
		list.add(0,"우드스톡");
		
		int size = list.size();
		System.out.println(size); // 4
		System.out.println("------------------------");
		
		String skill = list.get(1); // 스누피
		System.out.println(skill);
		System.out.println("------------------------");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println("------------------------");
		
		list.remove(2); // 찰리
		list.remove("루시");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}
