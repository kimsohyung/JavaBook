package Java61;

public class SHStack {
	private static final Coin[] Coin = null;
	private int[] ar;
	private int top;

	public SHStack() {
		ar = new int[10];
		top = -1;

	}

	public void push(Coin c) {
		ar[++top] = c.getValue();

	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public Coin pop() {
		Coin c = new Coin(ar[top--]);
		return c;
	}

}
