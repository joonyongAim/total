package 제네릭;

import java.util.ArrayList;

class Student<T> {
	T score;
	
	public void method(T t) {
		
	}
	
	// List를 매개변수로 항상 받고 싶음
	// 매개변수로 받아온 List의 제네릭은 뭐가되던간 다 받아오고싶음
	// ex) List<String> 가능,  List<Integer> 가능, List<아무거나> 다됨
	public void method2(ArrayList<T> list) {
		
	}
	
	public void method3(ArrayList<?> list) {
		
	}
}

public class Sample01 {

	public static void main(String[] args) {
		
		Student<String> s = new Student<>();
		s.score = "asdasd";
		
		s.method("123213");
		
		ArrayList<String> strList = new ArrayList<>();
		ArrayList<String> intList = new ArrayList<>();
		
		s.method2(strList);
		s.method2(intList);
		
		s.method3(strList);
		s.method3(intList);

	}

}
