package sedanFactory;

import component.Tire;

public class Sedan {

	public static void main(String[] args) {
		Tire compoTire = new Tire();
		compoTire.setSize(20);
		compoTire.setbigsize(20);
		
		System.out.println(compoTire.getSize());
		System.out.println(compoTire.getbigsize());

	}

}
//임폴트 = 다른 패키지에서 쓰이는 것을 가져오는것 = ctrl + shift + o