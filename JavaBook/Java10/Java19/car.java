package Java19;

public class car {
	String color;
	int cc;
	
	
	car(){
		
	}
	
	car(String color, int cc){
		this.color = color;
		this.cc = cc;
	}
	
	
	
	public static void main(String[] args) {
	
	car nycar1 = new car ();
	car mycar2 = new car("black", 3000);
	}

}
//클래스 = 멤버변수 + 메소드
//생성자는 특수한 형태의 메소드 
// 생성자는 클래스 이름과 같음
//멤버변수 = 변수가 들어가야함 (int size)
//생성자 오버로딩  = 매개변수의 타입과 개수 선언된 순서로 생성자를 구분 같으면 안됨
//객체지향 3가지, 생성자 오버로딩 => 면접 키워드 
//똑같은 파라미터 타입은 안됨 하지만 순서가 같은경우가 아닌 다른ㄱ뎡우는 가능함
//ex) String String(x) STring int / int String
