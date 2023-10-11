package Java18;

public class Tire{
	private int size;
	private int bigsize;
	
	public Tire() {
		System.out.print("tire");
		size = 0;
	}
	
	public void setSize(int psize) {
		size = psize;
	}

	public int getSize() {
		return size;
	}
	//
	public void setbigsize(int pbigsize) {
		bigsize = (pbigsize)*2;
	}

	public int getbigsize() {
		return bigsize;
	}
	
	
}
