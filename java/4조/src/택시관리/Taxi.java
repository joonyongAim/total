package 택시관리;

public class Taxi {

	
	TaxiAdmin[] taxiAdmin; // admin에서 입력받은 값 저장
	int taxiCounts; // 택시수 저장
	
	public Taxi(int maxSize) { // 입력받은 값만큼 방 생성
		taxiAdmin = new TaxiAdmin[maxSize]; // 택시 차량 수
		taxiCounts = 0;
	}
	
	
	// 택시안에 입력받을 값들
	public Taxi(String taxiNumber, String driverName, int taxiKm, int taxiRound) {
		
	}

	// 택시생성
	public void createTaxi(TaxiAdmin ta) {
		taxiAdmin[taxiCounts] = ta;
		taxiCounts++;
	}
		
	
	// 택시삭제
	public void removeTaxi(String taxiNumber) {
		int index = findTaxiInfo(taxiNumber);
		
		if(index == -1) {
			System.out.println("해당하는 택시가 없습니다");
			return;
		}
		for (int i = index; i<taxiCounts -1; i++) {
			taxiAdmin[i] = taxiAdmin[i+1];
		}
		taxiCounts --;
		System.out.println("해당 택시가 삭제 되었습니다");
		
		
	   }

	// 택시정보
	public void taxiInfo(String taxiNumber) {
		int index = findTaxiInfo(taxiNumber);
		if (index == -1) {
			System.out.println("해당 택시를 찾을 수 없습니다");
			return;
		}
		
		System.out.println("택시번호 : " + taxiAdmin[index].taxiNumber);
		System.out.println("택시기사 : " + taxiAdmin[index].driverName);
		System.out.println("운행거리 : " + taxiAdmin[index].taxiKm + "KM");
		System.out.println("운행횟수 : " + taxiAdmin[index].taxiRound + "회");
		System.out.println("총 금액 : " + (taxiAdmin[index].taxiMoney()) + "원");
		
	}
	
	// 모든택시 조회
	public void showAllTaxiInfo() {
		if (taxiCounts == 0) {
			System.out.println("등록된 택시가 없습니다");
		}
		int sum = 0;
		for (int i=0; i<taxiCounts; i++) { // 모든 방에 있는 택시를 조회 + 출력
			TaxiAdmin ta = taxiAdmin[i]; // taxiAdmin i번방에 있는 값을 ta에 저장
			
			System.out.println("==== " + (i+1) + "번택시" +" ====");
			System.out.println("택시번호 : " + ta.taxiNumber);
			System.out.println("택시기사 : " + ta.driverName);
			System.out.println("운행거리 : " + ta.taxiKm);
			System.out.println("운행횟수 : " + ta.taxiRound);
			System.out.println("택시금액 : " + (ta.taxiMoney()));
			sum = sum+ta.taxiMoney();
		}
		System.out.println("====================");
		System.out.println("모든택시 총 금액 : " + sum + "원");
		
	}
		
		
	
	// 택시찾기
	public int findTaxiInfo(String taxiNumber) { 
		for (int i=0; i<taxiCounts; i++) {
			if (taxiAdmin[i].getTaxiNumber().equals(taxiNumber)) {
				return i;
		}
	}
		return -1;
	}
	
	// 운행거리 추가 (금액계산에 필요함)
	public void taxiKm(String taxiNumber, int taxiKm) {
		int index = findTaxiInfo(taxiNumber);
		if (index == -1) {
			System.out.println("해당 택시를 찾을 수 없습니다");
			return;
		}
		taxiAdmin[index].taxiKm = taxiAdmin[index].taxiKm + taxiKm;
		System.out.println("총 운행거리 : " + (taxiAdmin[index].taxiKm) + "KM");
			
		}
	
	// 운행횟수 추가
	public void taxiRound(String taxiNumber, int taxiRound) {
		int index = findTaxiInfo(taxiNumber);
		if (index == -1) {
			System.out.println("해당 택시를 찾을 수 없습니다");
			return;
		}
		taxiAdmin[index].taxiRound = taxiAdmin[index].taxiRound + taxiRound;
		System.out.println("운행횟수 : " + taxiAdmin[index].taxiRound + "회");
			
			
				
			}	
	
	// 택시금액계산
	public void taxiMoney(String taxiNumber, int taxiKm) {
		int index = findTaxiInfo(taxiNumber);
		if (index == -1) {
			System.out.println("해당 택시를 찾을 수 없습니다");
			return;
		}
		// taxiKm * cost 
		System.out.println("총 금액 (1km당 1900원) : " + taxiAdmin[index].taxiMoney());
	}
}
	
	
	
	
	
 
