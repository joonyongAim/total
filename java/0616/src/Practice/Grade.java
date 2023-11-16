package Practice;

import java.util.Scanner;

public class Grade {
	
	Student[] students;
	int numStudents;
	
	public Grade(int maxSize) {
		students = new Student[maxSize];
		numStudents = 0;
	}
	
	public void addStudent(Student s) {
		
		students[numStudents] = s;
		numStudents++;
	
	}
	
	public void getAllStudents() {
		
		if(numStudents == 0) {
			System.out.println("등록된 학생이 없다");
			return;
		}
		for(int i=0; i<numStudents; i++) {
			Student s = students[i];
			
			System.out.println("학번 : " + s.studentId);
			System.out.println("이름 : " + s.name);
			System.out.println("평균 점수 : " + s.avgScore());
		}
	}
	
	public void searchStudent(String studentId) {
		int index = findStudentId(studentId);
		if(index == -1) {
			System.out.println("해당 학생이 존재하지 않습니다.");
			return;
		}
		
	}
	
	public int findStudentId(String studentId) {
		for(int i=0; i<numStudents; i++) {
			if(students[i].studentId.equals(studentId)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	public void removeStudent(String studentId) {
		int index = findStudentId(studentId);
		for(int i=index; i<numStudents-1; i++) {
			students[i] = students[i+1];
			
		}	
		
		numStudents--;
	}
}
