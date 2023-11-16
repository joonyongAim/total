package 생성자;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student() {
		
	}
	
	public void name() {
		
	}
	
	public int getTotal() {
		int sum = kor + eng + math;
		return sum;
		
	}
	
	public float getAverage() {
		float avg = (float) getTotal() / 3;
		avg = (float)Math.round(avg * 10) / 10;
		return avg;
	}
	
}
