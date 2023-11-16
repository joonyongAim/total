package 택시관리;

import java.util.Scanner;

public class TaxiMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;

		System.out.println("총 택시수를 입력하세요");
		Taxi t = new Taxi(sc.nextInt());

		while (true) {
			System.out.println("[1] 택시추가 [2] 택시삭제 [3] 운행거리 추가 [4] 총 운행횟수 추가 [5] 택시정보 조회 [6] 전체택시 조회 [0] 종료");
			choice = sc.nextInt();

			if (choice == 0)
				break;

			switch (choice) {
			case 1:
				System.out.println("택시번호를 추가하세요");
				String taxiNumber = sc.next();
				System.out.println("택시기사 이름을 입력하세요");
				String driverName = sc.next();
				TaxiAdmin ta = new TaxiAdmin(taxiNumber, driverName, 0, 0); // 택시번호, 기사명, 운행거리 + 운행횟수는 시작값0
				t.createTaxi(ta); // ta(TaxiAdmin값)를 t(Taxi)클래스 createTaxi로 전송
				break;

			case 2:
				System.out.println("삭제 할 택시번호를 입력하세요");
				taxiNumber = sc.next();
				t.removeTaxi(taxiNumber);
				break;

			case 3:
				System.out.println("택시번호를 입력해주세요");
				taxiNumber = sc.next();
				System.out.println("거리수를 입력하세요(km) : ");
				int taxiKm = sc.nextInt();
				t.taxiKm(taxiNumber, taxiKm);
				t.taxiMoney(taxiNumber, taxiKm); // 거리수 입력하자마자 계산
				break;

			case 4:
				System.out.println("택시번호를 입력해주세요");
				taxiNumber = sc.next();
				System.out.println("총 운행횟수를 입력하세요(회) : ");
				int taxiRound = sc.nextInt();
				t.taxiRound(taxiNumber, taxiRound);
				break;

			case 5:
				System.out.println("조회할 택시번호를 입력하세요");
				taxiNumber = sc.next();
				t.taxiInfo(taxiNumber);
				break;

			case 6:
				System.out.println("==== 모든택시 조회 ====");
				t.showAllTaxiInfo();

				break;

			}

		}

	}

}
