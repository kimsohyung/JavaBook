package Java18;

import component.Tire;

public class sedan {

	public static void main(String[] args) {
		Tire compoTire = new Tire();
		compoTire.setSize(20);
		compoTire.setbigsize(20);
		
		System.out.println(compoTire.getSize());
		System.out.println(compoTire.getbigsize());

	}

}