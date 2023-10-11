package Java38;

public class PhoneEcample {

	public static void main(String[] args) {
		//Phone phone2 = new Phone("이성당");
		
		//Phone phone1 = new SmartPhone("성심당");
		//좌항과 우항이 다름 추상클래스 = 자식 클래스 
		//추상 클래스에는 접근 가능하지만 자식 클래스 메소드는 쓸수 없다
		
		SmartPhone SmartPhone = new SmartPhone("홍길동");
		//자식 클래스에서는 전부 보임
		
		SmartPhone.turnOn();
		SmartPhone.internetSearch();
		SmartPhone.turnOff();

	}

}
