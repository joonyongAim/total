package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class 연습2추가 {

	public static void main(String[] args) {
		   ArrayList<Integer> list = scanNum();
		      ArrayList<Integer> oddList = isOdd(list);
		      ArrayList<Integer> evenList = new ArrayList<>();
		      isEven(list, evenList);
		      
		      System.out.println("홀수합계 : " + sum(oddList));
		      int oddSum = sum(oddList);
		      System.out.println("홀수합계 : " + oddSum);
		      
		      System.out.println("홀수평균 : " + avg(oddList));
		      
		      sum2(evenList);
		      avg2(evenList);
		   } 
		   public static void avg2(ArrayList<Integer> list) {
		      int sum = 0;
		      for(int n : list) {
		         sum += n;
		      }
		      
		      System.out.println("평균 : " + (sum/list.size()));
		      
		   }
		   
		   public static void sum2(ArrayList<Integer> list) {
		      int sum = 0;
		      for(int n : list) {
		         sum += n;
		      }
		      
		      System.out.println("합계 : " + sum);
		   }
		   
		   
		   public static double avg(ArrayList<Integer> list) {
		      int sum = sum(list);
		      
		      return (double)sum / list.size();
		   }
		   
		   public static int sum(ArrayList<Integer> list) {
		      int sum = 0;
		      for(int n : list) {
		         sum += n;
		      }
		      
		      return sum;
		   }
		   
		   
		   public static void isEven(ArrayList<Integer> list, ArrayList<Integer> evenList) {
		      for(Integer n : list) {
		         if(n % 2 == 0)
		            evenList.add(n);
		      }
		   }
		   
		   
		   public static ArrayList<Integer> isOdd(ArrayList<Integer> list) {
		      ArrayList<Integer> oddList = new ArrayList<>();
		      
		      for(Integer n : list) {
		         if(n % 2 == 1)
		            oddList.add(n);
		      }
		      
		      return oddList;
		   }
		   
		   
		   public static ArrayList<Integer> scanNum() {
		      Scanner sc = new Scanner(System.in);
		      ArrayList<Integer> list = new ArrayList<>();
		      int num;
		      do {
		         System.out.print("숫자 입력(종료:0) => ");
		         num = sc.nextInt();
		         
		         if(num != 0)
		            list.add(num);
		         
		      } while(num != 0);
		      
		      return list;


	}

}
