package Java23;

public class p92 {
	String model;
	int speed;
	
	p92(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 :" + this.speed + "km/h)");
		}
		
	}
	public static void main(String[] args) {
		p92 car1= new p92("Hyundai");
		p92 car2 = new p92 ("BMW");
		
		car1.run();
		car2.run();

	}

}
