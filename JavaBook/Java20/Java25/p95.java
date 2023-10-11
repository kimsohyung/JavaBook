package Java25;

public class p95 {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public p95(String ssn, String name) {
		this.ssn  = ssn;
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		p95 p1 = new p95("123456-1234567", "KyrBaek");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//p1.nation = "USA";
		//p1.ssn = "456789-4567890";
		p1.name = "Kim so hyung";
		System.out.println(p1.name);
		
	}

}
