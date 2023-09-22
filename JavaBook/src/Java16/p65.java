package Java16;

public class p65 {

	public static void main(String[] args) {
		Animal anil = new Animal();
		anil.name = "cat";
		anil.age = 10;

		
	System.out.println(anil.name);
	System.out.println(anil.age);
	}

}

class Animal{
	String name;
	int age;
}
//private = 비공개, 은밀하다 = 시크릿
// . -> 접근할때 씀 (메소드 호출) -> 직접적인 접근 
// 위에ㅡㄴ 간접적 

