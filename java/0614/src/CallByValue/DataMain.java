package CallByValue;

public class DataMain {

	public static void main(String[] args) {
		
		Data d = new Data();
		
		d.num = 5;
		
		System.out.println("num : " + d.num);
		
		d.change(d.num);
		
		System.out.println("Change호출 후 num : " + d.num);

	}

}
