package 스레드2;

public class PlayUser extends Thread {
	Charactor user;
	Charactor com;
	
	public PlayUser(Charactor user, Charactor com) {
		this.user = user;
		this.com = com;
	}

	@Override
	public void run() {
		int damage;
		int coolTime;
		
		try {
			while(true) {
				coolTime = (int)(Math.random() * 3) + 1;
				Thread.sleep(coolTime * 1000);
			
				if((int)(Math.random() * 10) == 5) {
					user.userSkillMsg();
					com.hp -= 30;
				} else {
					damage = (int)(Math.random() * 10) + 1;
					user.attackMsg(damage);
					com.hp -= damage;
				}
				
				System.out.println(com.userId + "남은 체력 : " + com.hp);
				
				if(com.hp <= 0) {
					user.endMsg();
					System.exit(0);
				}
			
			}
		} catch (Exception e) {
		} 
	}
	
	
}
