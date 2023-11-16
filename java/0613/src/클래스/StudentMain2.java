package 클래스;

public class StudentMain2 {

	public static void main(String[] args) {
		
		Student[] students = new Student[30];
		
		for(int i=0; i<students.length; i++) {
			students[i] = new Student();
			
			students[i].name = "학생" + (i + 1);
			students[i].age = 18;
			students[i].phone = "010-12" + i + "-9999";
			
			System.out.println(i+1 + "번 학생 정보");
			students[i].showInfo();
		}

	}

}
