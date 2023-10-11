package Java6;

public class p75 {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2+1);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3); 
		
		
		//%d = 정수형으로 변환   %c =char형으로 변환
		System.out.printf("c2 : %d\n" ,(int) c2); 
		System.out.printf("c2 : %c\n" , c2); 

	}

}
