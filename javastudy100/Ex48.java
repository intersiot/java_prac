package javastudy100;

import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		// ?????? 문제 이해를 못하겠는데?
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		int ssn = scan.nextInt();
		System.out.println("입력: ");
		int num = scan.nextInt();
		
		if (num == 1 || num == 2) {
			int age = (1120000 - ssn) / 10000;
			System.out.println(age);
		} else {
			int age = (120000 - ssn) / 1000;
			System.out.println(age);
		}

	}

}
