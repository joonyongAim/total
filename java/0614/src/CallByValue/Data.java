package CallByValue;

public class Data {
	
		int num;
		
		public void change(int num) {
			num = 1000;
			System.out.println("change메서드 호출 num : " + num);
		}

}
