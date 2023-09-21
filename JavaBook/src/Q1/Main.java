package Q1;

public class Main {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 45) + 1;
		int b = (int) (Math.random() * 45) + 1;
		int c = (int) (Math.random() * 45) + 1;
		int d = (int) (Math.random() * 45) + 1;
		int e = (int) (Math.random() * 45) + 1;
		int f = (int) (Math.random() * 45) + 1;

		System.out.print("로또 번호 : ");
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d + " ");
		System.out.print(e + " ");
		System.out.println(f + " ");
		System.out.println("-----------틀림-----");
		if (a < 46) {

		} else if (a == b) {
			b = (int) (Math.random() * 45) + 1;
			System.out.print(b);
		} else if (b == c) {
			c = (int) (Math.random() * 45) + 1;
			System.out.print(c);
		} else if (c == d) {
			d = (int) (Math.random() * 45) + 1;
			System.out.print(d);
			return;
		} else if (d == e) {
			e = (int) (Math.random() * 45) + 1;
			System.out.print(e);
			return;
		} else if (e == f) {
			f = (int) (Math.random() * 45) + 1;
			System.out.print(f);
			return;
		} else {

		}

	}
}
