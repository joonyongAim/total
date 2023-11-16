package CallByReference;

public class DataMain {

	public static void main(String[] args) {
		
		Data d = new Data();
		
		d.num = 5;
		
		Data d2 = d.copy(d);
		
		d.num = 10;
		
		System.out.println(d2.num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("num : " + d.num);
//		
//		d.change(d);
//		
//		System.out.println("change 호출 후 num : " + d.num);
	}

}
