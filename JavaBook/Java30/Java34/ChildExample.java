package Java34;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		parent parent = new parent();
		
		parent.method1();
		parent.method2();
		//parent.method3(); 브모 클래스는 자식클래스에서 가져올 수 없기 때문에 안됨
		
		
		child.method1();
		child.method2();
		child.method3();
		
		
		System.out.println("-------------------------------------------");
		
		parent = child;
		parent.method1();
		parent.method2();
		
		
		

	}

}
