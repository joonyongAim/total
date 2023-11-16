package 병원;

import java.util.Scanner;

public class MedicalValue {
	int cm;
	int kg;
	double bmi;		//비만 //24미만 정상  중간과체중  30이상 비만
	int push;		//혈압 //140이상이면 고혈압 나머지는정상 120미만저혈압
	int pee;		//소변(당뇨여부, 수치로 판단) 100점이상이면 당뇨
	String xray;	//흉부Xray(폐렴pn, 결핵tn 여부) 
	String stomach;	//복부초음파(지방간, 간암의심여부) //liver , Cancer
	int stress;		//스트레스 검사(수치로 판단) //80점이상이면 위험
	

			//clients[0].mv.bmi
			
	public void reBmi() {
		bmi = (double)kg/(cm*cm);
		bmi = Math.round(bmi*10000);
		if(bmi<30) {
			System.out.println("③ 비만도는: " + bmi + ", 비만 입니다.");
		}else {
			System.out.println("③ 비만도는: " + bmi + ", 정상 입니다");
		}	
	}
	public void rePush() {
		if(push>140) {
			System.out.println("④ 혈압수치는: " + push + ", 고혈압 입니다.");
		}else if(push >119){
			System.out.println("④ 혈압수치는: " + push + ", 정상 입니다.");
		}else {
			System.out.println("④ 혈압수치는: " + push + ", 저혈압 입니다.");
		}
	}
	
	public void rePee() {
		if(pee>100) {
			System.out.println("⑤ 소변 검사 결과는 " + pee + ", 당뇨 입니다.");
		}else{
			System.out.println("⑤ 소변 검사 결과는 " + pee + ", 정상 입니다.");
		}
	}
	public void reXray() {
		String pn,tn;		
		if(xray.equals("pn")) {
			System.out.println("⑥ Xray결과는 폐렴 입니다.");
		}else if(xray.equals("tn")) {
			System.out.println("⑥ Xray결과는 결핵 입니다.");		
		}else {
			System.out.println("⑥ Xray결과는 정상 입니다.");
		}

	}
	public void reStomach() {
		String liver,cancer;
		if(stomach.equals("liver")) {
			System.out.println("⑦ 복부초음파 결과는 지방간 입니다.");
		}else if(stomach.equals("cancer")) {
			System.out.println("⑦ 복부초음파 결과는 암 입니다.");
		}else {
			System.out.println("⑦ 복부초음파 결과는 정상 입니다.");
		}
	}
	public void reStress() {
		if(stress>=80) {
			System.out.println("⑧ 스트레스 수치는 "+ stress + " 이므로 위험 입니다.");
		}else {
			System.out.println("⑧ 스트레스 수치는 정상 입니다.");
		}
	}
	
	
	
	}