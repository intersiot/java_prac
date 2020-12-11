package javastudy100;

import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		
		int year = scan.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0) { // 이면서 (AND)
			System.out.println("yes");
		} else if (year % 400 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
