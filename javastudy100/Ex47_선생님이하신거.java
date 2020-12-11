package javastudy100;

import java.util.Scanner;

public class Ex47_선생님이하신거 {

	public static void main(String[] args) {
		// 윤년 판별
		// 1. 해가 4의 배수이면서 100의 배수가 아니면 윤년
		// 2. 400의 배수이면 윤년
		// 두 조건 중 하나라도 맞으면 윤년
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력:");
		int year = scan.nextInt();
		
		// AND: ~이면서, ~이고
		// OR: ~이거나, 또는
		// 윤년 조건 따지기
		boolean isYun1 = (year % 4) == 0 && (year % 100) != 0;
		boolean isYun2 = (year % 400) == 0;
		
		if (isYun1 == true) {
			System.out.println("윤년입니다.");
		}
		else if (isYun2 == true) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	}

}
