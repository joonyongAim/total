package 복습;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeManager {

   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
      HashMap<String, Integer> gradeMap = new HashMap<>();

      boolean exit = false;
      while (!exit) {
         System.out.println("1. 학생 성적 정보 입력");
         System.out.println("2. 학생 성적 정보 검색");
         System.out.println("3. 전체 학생 성적 출력");
         System.out.println("4. 프로그램 종료");
         System.out.print("원하는 기능을 선택하세요: ");
         int choice = sc.nextInt();

         switch (choice) {
         case 1:
            inputStudentGrade(gradeMap);
            break;
         case 2:
            searchStudentGrade(gradeMap);
            break;
         case 3:
            printAllStudentGrades(gradeMap);
            break;
         case 4:
            exit = true;
            System.out.println("프로그램을 종료합니다.");
            break;
         default:
            System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            break;
         }

         System.out.println();
      }
   }

   // 학생 성적 정보 입력 메소드
   public static void inputStudentGrade(HashMap<String, Integer> gradeMap) {
	   
	   System.out.print("학생 이름 : ");
	   String name = sc.next();
	   System.out.print("학생 성적 : ");
	   int score = sc.nextInt();
	   
	   gradeMap.put(name, score);
	   System.out.println("학생 등록 완료");
	}

   // 학생 성적 정보 검색 메소드
   public static void searchStudentGrade(HashMap<String, Integer> gradeMap) {
	  
	   System.out.print("학생 이름 : ");
	   String name = sc.next();
	   
	   Integer score = gradeMap.get(name);
	   
	   if(score != null)
		   System.out.println(name + " : " + gradeMap.get(name));
	   else
		   System.out.println("해당 학생 정보가 없음");
   }

   // 전체 학생 성적 출력 메소드
   public static void printAllStudentGrades(HashMap<String, Integer> gradeMap) {
      gradeMap.forEach((k, v) -> {
    	  System.out.println(k + " : " + v);
      });
   }

}