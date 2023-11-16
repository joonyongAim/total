package CallByReference;

public class Data {
	int num;
	
	public Data copy(Data data) {
		Data d = data;
		
		return d;
	}
	
	public void change(Data data) {
		System.out.println(data);
		data.num = 1000;
		System.out.println("change메서드 호출 num : " + data.num);
	}
}
