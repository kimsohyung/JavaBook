package Java20;

public class car {
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;

	car() {

	}

	car(String model) {
		this(model, "silver", 200) ;
	}

	car(String model, String color) {
		this(model, color, 200); 
	}
 
	car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;   
	}

	public static void main(String[] args) {
		car car1 = new car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		car car2 = new car("Sonata");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		car car3 = new car("Sonata", "res");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		car car4 = new car("Sonata", "red", 190);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
	}

}
//멤버 변수 + 메소드 = 클레스
//int a;  double d = 3.0   ---> 멤버 변수 선언 클레스 내에 사용 가능
//void met() {intb;}  ---> 메소드 지역변수 b
//
//
