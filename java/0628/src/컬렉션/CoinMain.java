package 컬렉션;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		
		while(!coinBox.empty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼낸 동전 : " + coin.getValue());
		}
		
	}

}

class Coin {
	int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}