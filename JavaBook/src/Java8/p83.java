package Java8;

public class p83 {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "jdk";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;
		
		String str5 = "Jdk" + 3 + 3.0;
		String str6 =  3 + 3.0 + "Jdk";
		
		
		System.out.print(str1);
		System.out.print(str2);
		System.out.print(str3);
		System.out.print(str4);
		System.out.print(str5);
		System.out.print(str6);
		/*"j" + 3 + 3.0 = J33.0 문자열 문자열 문자열 = 문자열
		 * 3 + 3.0 + "j" = 6.0J 숫자형 숫자형 문자열 = 문자열
		 * 다른이유 : 좌측에서 우측으로 이동하기 때문에 문자열에 3을 더한거고 밑에는 숫자먼저 계산되었기 때문에
		 * 위에는 문자열로 계산이 되고 밑에는 숫자 먼저 계산됨
		 */

	}

}
