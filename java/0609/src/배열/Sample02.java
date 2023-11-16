package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Sample02 {

   public static void main(String[] args) {
      
      int[] score = new int[5];
      int i;
      
      Scanner sc = new Scanner(System.in);
      
      for(i=0; i<5; i++) {
         System.out.print(i + 1 + "번째 점수 입력 : ");
         score[i] = sc.nextInt();
      }
      
      for(i=0; i<5; i++) {
         System.out.print(score[i] + " ");
      }
      
      System.out.println();
      System.out.println("score.length : " + score.length);
      
      for(i=0; i<score.length; i++) {
         System.out.print(score[i] + " ");
      }
      
      System.out.println();
      // 향상된 for문
      for(int a : score) {
         System.out.print(a + " ");
      }
      System.out.println();
      
      // 배열에 저장된 값 단순 출력
      System.out.println("toString 사용함");
      System.out.println(Arrays.toString(score));
   }

}










