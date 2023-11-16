package 스트림;

import java.util.Comparator;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	
	String name;
	int ban;
	int totalScore;
	
	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	@Override
	public int compareTo(Student o) {
		return o.totalScore - this.totalScore;
	}
	
}

public class Sample06 {
	public static void main(String[] args) {
		
		Stream<Student> stuStream = Stream.of(
				new Student("aaa", 3, 300),
				new Student("bbb", 1, 200),
				new Student("ccc", 2, 100),
				new Student("ddd", 2, 150),
				new Student("eee", 1, 250),
				new Student("qqq", 3, 280),
				new Student("www", 1, 210),
				new Student("rrr", 2, 150)
		);
		
	stuStream.sorted(Comparator.comparing(Student::getBan)
						   .thenComparing(Comparator.naturalOrder()))
			 .forEach(System.out::println);

	}

}
