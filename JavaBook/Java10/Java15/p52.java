package Java15;

import java.util.Calendar;

public class p52 {

		enum Week {
			Monday, Tuesday, Thursday, Wednesday,Friday  ,Saturday, Sunday
		};
		public static void main(String[] args) {
			Week today = null;
			
			Calendar cal = Calendar.getInstance();
			//getInstance = 싱글턴 패턴으로 인스턴스를 제한함 
			int iWeek = cal.get(Calendar.DAY_OF_WEEK);
			
		switch (iWeek){
		case 1 :
			today = Week.Sunday;
			break;
		case 2 :
			today = Week.Monday;
			break;
		case 3 :
			today = Week.Tuesday;
			break;
		case 4 :
			today = Week.Wednesday;
			break;
		case 5 :
			today = Week.Thursday;
			break;
		case 6 :
			today = Week.Friday;
			break;
		case 7 :
			today = Week.Saturday;
			break;
		
		}
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.Sunday) {
			System.out.println("오늘은 쉬는날 입니다");
		}else {
			System.out.println("오늘은 공부하는 날 입니다");
		}
		
		//class = 붕어빵틀 객체= 붕어빵
	}

}
