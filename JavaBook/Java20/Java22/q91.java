package Java22;

public class q91 {
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	public static void main(String[] args) {
		q91 mycalc = new q91();
		
		double result1 = mycalc.areaRectangle(4.0);
		double result2 = mycalc.areaRectangle(4.0, 6.0);
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
