package CallByReference;

public class Person {
	String name;
	int kor,eng,math;
	int total;
	double avg;
	int rank;
	
	public void total() {
		total = kor + eng + math;
	}
	
	public void avg() {
		avg = total / 3.0;
	}
	
	public void rank(Person[] p) {
		
		rank = 1;
		
		for(int i=0; i<p.length; i++) {
			
			if(avg < p[i].avg)
				rank++;
		}
		
	}
	
	public void printInfo() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\t" + rank);
	}

}
