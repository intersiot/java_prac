package javastudy100;

import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int cal = 0;
		System.out.println("1.치즈버거 2.야채버거 3.우유 4.계란말이 5.샐러드");
		
		// 메뉴를 2개 고를 때
		for (int i = 0; i < 2; i++) {
			System.out.println("메뉴 번호 입력: ");
			int num = scan.nextInt();
			
			switch(num) {
			case 1:
				int cheese = 400;
				cal += cheese;
				continue;
			case 2:
				int veget = 340;
				cal += veget;
				continue;
			case 3:
				int milk = 170;
				cal += milk;
				continue;
			case 4:
				int egg = 100;
				cal += egg;
				continue;
			case 5:
				int salad = 70;
				cal += salad;
				continue;
			}
			
		}
		
		System.out.println("총 칼로리: " + cal);
		
		if (cal > 500) {
			System.out.println("angry");
		} else if (cal <= 500) {
			System.out.println("no angry");
		}
	}

}
