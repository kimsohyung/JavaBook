package Java2.p62;

public class Main {
	public static void main(String[] args) {
		
		short s = 100;
		short s2 = 32767;
		//short  result = -s;
		// -가 붙은 경우는 산출결과 무조건 int로 바뀐다
		int result2 = -s;
		
		System.out.println(s);
		System.out.println(result2);
	}
}
