package Java5;

public class p74 {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 : " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 : " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 : " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 : " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 : " + result5);
		
		double result6 = (double) v1 / v2;
		System.out.println("result6 : " + result6);
		//v1만 먼저 5.0으로 바뀌어서 5.0 % 2 = 2.5로 나온다. --> [(dounble)v1 ] / v2
		//()안을 형 변환을 의미한다.(명시적)으로 적은것
		//암묵적으로 작은값을 큰값으로 넣을 떄는 적지 않음
		
	}
}
