package Java13;

public class p41 {
	public static void main(String[] args) {
		
		String strvar1= "JBEdu";
		String strvar2= "JBEdu";
		
		if(strvar1==strvar2) {
			System.out.println("참조가 같음");
		}else {
			System.out.println("참조가 다름");
		}
		if(strvar1.equals(strvar2)) {
			System.out.println("두 문자열이 같음");
		}
		//하나의 힙에 저장
		
		
		
		
		String strvar3= new String ("JBEdu");
		String strvar4= new String ("JBEdu");
		
		if(strvar3==strvar4) {
			System.out.println("참조가 같음");
		}else {
			System.out.println("참조가 다름");
		}
		if(strvar3.equals(strvar4)) {
			System.out.println("두 문자열이 같음");
		}
		//각자 다른 힙에 저장
		
	}
	
}
