package java1.p53;

public class p53 {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 200L;
		//long var3 = 10000000000;   정수값(인트 int)의 범위를 벗어났기 때문에
		long var4 = 10000000000L;    // L = 인티져(인트)를 롱타입으로 변환
		
		System.out.println(var1);
		System.out.println(var2);
	//	System.out.println(var3);  작은값은 큰값에 들어갈수 있지만 큰 값은 작은값에 들어가지 못한다
		System.out.println(var4);

	}

}
