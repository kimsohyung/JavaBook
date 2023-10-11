package Java57;

import java.util.Random;
import java.util.Scanner;

public class Minigame {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int Strike = 0;
		int ball = 0;
//랜던값 만들기
		while (true) {
			a = random.nextInt(100) % 9 + 1; 
			b = random.nextInt(100) % 9 + 1;
			c = random.nextInt(100) % 9 + 1;
			if (!(a == b || b == c || a == c)) {
				break;
			}
		}
		System.out.println(a+" "+ b + " "+c);
		int[] com = { a, b, c };

//반복 게임 만들기	(입력값 받기)	
		while (true) {
			int[] user = new int[3];
			System.out.println("Input naumer. . .");
			for (int i = 0; i < 3; i++) {
				user[i] = sc.nextInt();
			}

//반복 게임 만들기	(조건 만들기)				
			for (int j = 0; j < user.length; j++) {
				for (int k = 0; k < com.length; k++) {
					if (user[j] == com[k]) {
						if (j == k) {
							Strike++;
						} else {
							ball++;
						}
					}

				}
			}
			System.out.println("Strike : " + Strike + " , ball : " + ball);
			if (Strike == 3) {
				System.out.println("Game Over!!!");
				break;

			}
			Strike = 0;
			ball = 0;
		}
		sc.close();
	}

}
