package Java17;

public class p67 {

	public static void main(String[] args) {
		Animal anil = new Animal();
//		anil.name = "cat";
		anil.setName("Cat2");
		anil.age = 10;

		// System.out.println(anil.Name);
		System.out.println(anil.getName());
		System.out.println(anil.age);
	}

}

class Animal {
	private String name;
	int age;

	public void setName(String pname) {
		name = pname;
	}

	public String getName() {
		return name;
	}
}
// 변수 = age, name
// 메소드 getName()(받고보내기), setName()(세팅만가능(특정한 상태에 있게함))
// 위에 두 메소드만 가져가서 수정 가능
// 다른클래스에서 age를 세팅하므로 직접적,
// name 은 anil에서 간접적으로 가져왔으므로 간접적임
//외부에서 멤버변수를 꺼내올떄 쓰는 메소드 = get/set method

//public = 외부에서 접근 가능 <=> private
//void = return이 없다.

//Source-Generate getters and Setters
//자동으로 만들어줌(이클립스 툴에서 사용됨)