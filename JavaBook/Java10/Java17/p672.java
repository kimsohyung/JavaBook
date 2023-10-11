package Java17;

public class p672 {
	public static void main(String[] args) {
		A anil = new A();
//		anil.name = "cat";
		anil.setName("Cat2");
		anil.setAge(10);

		// System.out.println(anil.Name);
		System.out.println(anil.getName());
		System.out.println(anil.getAge());
	}

}

class A {
	private String name;
	private int age;

	public void setName(String pname) {
		name = pname;
	}

	public String getName() {
		return name;
	}
	public void setAge(int page) {
		age = page;
	}

	public int getAge() {
		return age;
	}
}

