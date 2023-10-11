package Java21;

public class q90 {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double plus(double x, double y) {
		double result = x + y;
		return result;
	}

	public static void main(String[] args) {
		q90 mycalc  = new q90();
		int res1 = mycalc.plus(5 , 10);
		double res2 = mycalc.plus(10.5, 20.5);
		
		System.out.println(res1);
		System.out.println(res2);
		
		

	}

}
