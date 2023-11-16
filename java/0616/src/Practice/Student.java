package Practice;

public class Student {
	
	String studentId;
	String name;
	int[] scores;
	
	
	public Student(String studentId, String name, int[] scores) {
		this.studentId = studentId;
		this.name = name;
		this.scores = scores;
	}
	
	public double avgScore() {
		
		int sum = 0;
		double avg;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
		}
		avg = sum / scores.length;
		
		return avg;
	}
	
	
	
	
	
	
}
