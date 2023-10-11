package Java28;

class parent {
	parent() {
		System.out.println("Parent class Constructor...");
	}
}

class child extends parent {
	child() {
		System.out.println("child class Constructor...");
	}
}

public class Main {
	public static void main(String[] args) {
		child c = new child();

	}

}
