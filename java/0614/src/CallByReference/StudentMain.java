package CallByReference;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu = new Student();
		
		stu.score[0] = 80;
		stu.score[1] = 90;
		stu.score[2] = 70;
		
		int sum;
		
		sum = stu.add(stu.score);
		
		System.out.println(sum);

	}

}
