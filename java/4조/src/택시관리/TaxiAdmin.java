package 택시관리;

public class TaxiAdmin {

	
	String taxiNumber; // 택시번호
	String driverName; // 택시기사 이름
	int taxiKm; // 금일 택시 키로수
	int taxiRound; // 금일 택시 운행횟수
	final int cost = 1900; // 고정된 가격
	
	
	public TaxiAdmin() {
		
	}
	
	// 입력받은 택시의 정보들 보관
	public TaxiAdmin(String taxiNumber, String driverName, int taxiKm, int taxiRound) {
		this.taxiNumber = taxiNumber;
		this.driverName = driverName;
		this.taxiKm = taxiKm;
		this.taxiRound = taxiRound; 
	}
	
	public String getTaxiNumber() { 
		return taxiNumber;
	}
	
	public int taxiMoney() {
		return taxiKm * cost;
	}
	
}
