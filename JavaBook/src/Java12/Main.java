package Java12;

public class Main {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		System.out.println("현재시간 : " + time);
		
		switch(time) {
		case 8 :
			System.out.println("출근합니다");
		case 9 :
			System.out.println("회의를 합니다");
		case 10 :
			System.out.println("업무를 봅니다.");
			
	
		}

	}

}
