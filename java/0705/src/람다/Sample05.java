package 람다;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class LambdaMember {
	String name;
	int age;
	
	LambdaMember() {
		System.out.println("기본생성자 호출");
	}
	
	LambdaMember(String name) {
		System.out.println("name생성자 호출");
		this.name = name;
	}
	
	LambdaMember(String name, int age) {
		System.out.println("name, age생성자 호출");
		this.name = name;
		this.age = age;
	}
}

public class Sample05 {

	public static void main(String[] args) {
		
		Function<String, LambdaMember> f1 = (str) -> {
			return new LambdaMember(str);
		};
		
		LambdaMember m1 = f1.apply("홍길동");
		System.out.println(m1.name);
		System.out.println(m1.age);
		
		Supplier<LambdaMember> sp = LambdaMember::new;
		
		LambdaMember m2 = sp.get();
		System.out.println(m2.name);
		System.out.println(m2.age);
		
		BiFunction<String, Integer, LambdaMember> bf = LambdaMember::new;
		
		LambdaMember m3 = bf.apply("고길동", 30);
		System.out.println(m3.name);
		System.out.println(m3.age);

	}

}
