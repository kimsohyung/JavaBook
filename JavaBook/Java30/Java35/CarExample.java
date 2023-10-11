package Java35;

public class CarExample {

	   public static void main(String[] args) {
	      Car Tire = new Car();                                            
	      
	      for(int i = 1; i <= 5; i++) {
	         int problemLocation = Tire.run();
	         
	         switch(problemLocation) {
	         case 1:
	            System.out.println("앞왼쪽 HankookTire로 교체");
	            Tire.tires[0] = new HankookTire("앞왼쪽", 15);
	            break;
	         case 2:
	            System.out.println("앞오른쪽 HankookTire로 교체");
	            Tire.tires[1] = new HankookTire("앞오른쪽", 13);
	            break;
	         case 3:
	            System.out.println("뒤왼쪽 HankookTire로 교체");
	            Tire.tires[2] = new HankookTire("뒤왼쪽", 14);
	            break;
	         case 4:
	            System.out.println("뒤오른쪽 HankookTire로 교체");
	            Tire.tires[3] = new HankookTire("뒤오른쪽", 17);
	            break;
	         }
	         System.out.println("------------------------------");
	      }
	   }

	}