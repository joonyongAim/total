package api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main02 {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
		
		f1 = new SimpleDateFormat("yyyy-MM-dd");
		f2 = new SimpleDateFormat("yy/MM/dd");
		f3 = new SimpleDateFormat("yyyy년MM월dd일");
		f4 = new SimpleDateFormat("hh:mm:ss");
		f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		f6 = new SimpleDateFormat("yyyy년의 w주차");
		f7 = new SimpleDateFormat("h:mm a");
		
		System.out.println(f1.format(now));
		System.out.println(f2.format(now));
		System.out.println(f3.format(now));
		System.out.println(f4.format(now));
		System.out.println(f5.format(now));
		System.out.println(f6.format(now));
		System.out.println(f7.format(now));
		

	}

}
