package api;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("년도 : " + today.get(Calendar.YEAR));
		System.out.println("월 : " + (today.get(Calendar.MONTH)+1));
		System.out.println("올해 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일 : " + today.get(Calendar.DATE));
		System.out.println("요일 : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전오후 : " + today.get(Calendar.AM_PM));
		System.out.println("시 : " + today.get(Calendar.HOUR));
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("초 : " + today.get(Calendar.SECOND));
	
	}

}
 