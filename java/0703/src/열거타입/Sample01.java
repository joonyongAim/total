package 열거타입;

public class Sample01 {

	public static void main(String[] args) {
		
		if(Card.Kind.CLOVER == Card.Value.TWO) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

	}

}
