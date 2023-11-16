package 병원;

import java.util.Scanner;

public class Medical {
//Client[] 전체배열
//numClient 전체 예약자 수 
//addClient 추가 
//subClient 취소/삭제
//pro 진행
//result 결과출력
//getclientInfo 특정조회
//getAllclient 전체조회
//findclientInfo //배열방 조회 
	//
	Scanner sc = new Scanner(System.in);
	
	Client [] clients; //고객정보를 담는 배열
	int numClient;   //등록된고객 수
	
    //생성자 매개변수 //생성자 클래스이름과같아야함. 리턴타입x 
	public Medical(int maxSize){
	clients = new Client[maxSize];
	
	}
	
	
	//환자 추가    
    public void addClient( Client c) {
       if(numClient== clients.length) {
          System.out.println("더이상 추가할수 없습니다");
          return;
       }
       clients[numClient] = c;
       numClient++;
       System.out.println("✔추가 완료");
    }
	
	//예약번호로 삭제 
	public void subClient(int id) {
		int index = findClientInfo(id);
		if(index == -1) {
			System.out.println("등록된 수검자가 없습니다");
			return;
		}						//땡기는것
		for(int i=index; i<numClient-1; i++) {
			clients[i] = clients[i+1]; //
		}
		numClient--;
		System.out.println("✔삭제 완료");
	}
	
	
	//예약번호(ID)로 특정조회
	public void getClientuinfo(int Id) {
		int index = findClientInfo(Id);
		if(numClient == 0) {
			System.out.println("🚫 등록된 수검자가 없습니다 🚫");
			return;
		}
		if(index == -1) {
			System.out.println("🚫 해당 수검자 정보없음 🚫");
			return;
		}
		System.out.println("=========예약자 명단=========");
		System.out.println("예약번호 : " +clients[index].id);
		System.out.println("시간 : " + clients[index].time);
		System.out.println("이름 : " + clients[index].name);
		System.out.println("나이 : " + clients[index].age);
		System.out.println("성별 : " + clients[index].gender);				
		System.out.println("=========================");
	}
	
	//전체조회
	public void getAllClients() {
		
		if(numClient == 0) {
			System.out.println("🚫 등록된 수검자가 없습니다 🚫");
			return;
		}
		
		for(int i=0; i<numClient; i++) {
			
			System.out.println("=========예약자 명단=========");
			System.out.println("예약번호 : " + clients[i].id);
			System.out.println("시간 : " + clients[i].time + "시");
			System.out.println("이름 : " + clients[i].name);
			System.out.println("나이 : " + clients[i].age);
			System.out.println("성별 : " + clients[i].gender);						
			System.out.println("=========================");
		}
	}
	
	public void MedicalPack (int id) {
		int index=findClientInfo(id);
		Client c = clients[index];
		MedicalValue mv = new MedicalValue();
		if(index == -1) {
			System.out.println("🚫 해당 수검자 정보없음 🚫");
			return;
		}
		System.out.println("=======검진 검사지 =======");

		if(c.pkg>=0) {
			System.out.print("① 키 :");
			mv.cm = sc.nextInt();
			System.out.print("② 몸무게 :");
			mv.kg = sc.nextInt();		
			System.out.print("③ 혈압: ");
			mv.push = sc.nextInt();
			
			System.out.print("④ 소변: ");
			mv.pee = sc.nextInt();
		}	
		
		if(c.pkg>=1) {
			System.out.print("⑤ X-ray[pn/tn/X]: ");
			mv.xray = sc.next();
			
			System.out.print("⑥ 복부초음파[liver/cancer/X]: ");
			mv.stomach = sc.next();
		}	
					
		if(c.pkg>=2) {
			System.out.print("⑦ 스트레스 수치: ");
			mv.stress = sc.nextInt();	//mv객체에있는 멤버변수값
		}
		System.out.println("✔검사 완료");
		c.pack = mv;
		
	}

	
	//배열방 조회 //id가 clients배열 어디에있는지 조회
    public int findClientInfo(int id) {
    	for(int i = 0; i<clients.length; i++) {
    		if(clients[i].id == id) 
    			return i;  	
    	}
    	return -1;  
    }
    
    
    public void result(int id) {
    	int index=findClientInfo(id);
    	
    	if(index == -1) {
		System.out.println("🚫 등록된 수검자가 없습니다 🚫");
		return;
    	}	
    	
    	Client c = clients[index];
    	if(c.pkg>=0) {
		System.out.println("① 키: " + c.pack.cm);		
		System.out.println("② 몸무게 : "+ c.pack.kg);
		c.pack.reBmi();		 
		c.pack.rePush();	
		c.pack.rePee();		
    	}
    	
    	if(c.pkg>=1) {
			c.pack.reXray();
			c.pack.reStomach();
    	}
    	if(c.pkg>=2) {
    		c.pack.reStress();	
    		
    	}
    }
       
}