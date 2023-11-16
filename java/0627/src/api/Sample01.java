package api;

import java.text.DecimalFormat;

public class Sample01 {

	public static void main(String[] args) {
		
		double num = 1234567.897;
		System.out.println(num);
		
		DecimalFormat df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));

	}

}
