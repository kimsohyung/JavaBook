package Java26;

class A {
	int fieldA = 2;

	void methodA() {
		System.out.println(fieldA);
	}
}

class B extends A {
	int fieldB = 3;

	void methodB() {
		System.out.println(fieldB);
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();

		B b = new B();
		b.methodA();
		b.methodB();

	}

}
//클래스 안에 퍼블릭이 두번이상 들어가면 안된다.