package mail.smtp;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSMTP {
	
	Properties serverInfo; // 이메일 서버 설정 저장하는 겍체
	Authenticator auth; // 이메일 서버 인증 정보를 저장하는 객체
	
	public MailSMTP() {
		serverInfo = System.getProperties();
		
		// tls를 사용하도록 설정
		serverInfo.put("mail.smtp.starttls.enable", "true");
		// naver smtp서버 설정
		serverInfo.put("mail.smtp.host", "smtp.naver.com");
		// smtp인증을 사용
		serverInfo.put("mail.smtp.auth", "true");
		// smtp port번호 설정
		serverInfo.put("mail.smtp.port", "587");
		
		// naver서버 주소를 신뢰한다
		serverInfo.put("mail.smtp.ssl.trust", "smtp.naver.com");
		// 소켓팩토리 사용 안함
		serverInfo.put("mail.smtp.socketFactory.fallback", "false");
		// 프로토콜 버전 설정
		serverInfo.put("mail.smtp.ssl.protocols", "TLSv1.2");
		
		auth = new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// 사용자 메일,비번을 받아서 인증정보를 만듬
				return new PasswordAuthentication("joonyongcho@naver.com", "joon041024");
			}
			
		};
	}
	
	public int sendMail(String to, String subject, String content) {
		int result = 0; // 메일 전송 결과를 저장하는 변수
		
		// 이메일 전송에 필요한 세션객체를 생성
		Session session = Session.getInstance(serverInfo, auth);
		// 디버그모드 사용
		session.setDebug(true);
		
		// 메일 전송 메세지 객체를 생성
		MimeMessage msg = new MimeMessage(session);
		
		try {
			// 보내는사람 설정
			msg.setFrom(new InternetAddress("joonyongcho@naver.com"));
			// 받는사람 설정
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			// 제목
			msg.setSubject(subject);
			// 내용
			msg.setText(content);
			
			// 전송
			Transport.send(msg);
			result = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
