package Java42;

public class OuterClass {
	private int outVar = 10;
	private static int outStaticVar = 20;
	
	class InnerClass{
		public void printInfo() {
			System.out.println("outvar = "+outVar);
			System.out.println("outStaticVar = " + outStaticVar);
		}
	}
}
