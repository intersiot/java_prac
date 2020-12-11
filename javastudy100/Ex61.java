package javastudy100;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		// 계산기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		int a = scan.nextInt();
		System.out.println("입력: ");
		String cal = scan.next();
		System.out.println("입력: ");
		int b = scan.nextInt();
		
		switch (cal) {
			case "+":
				System.out.println("a " + "+" + " b" + " = " + (a + b));
				break;
			case "-":
				System.out.println("a " + "-" + " b" + " = " + (a - b));
				break;
			case "/":
				System.out.println("a " + "/" + " b" + " = " + (a / b));
				break;
			case "*":
				System.out.println("a " + "*" + " b" + " = " + (a * b));
				break;
		}
		
		
	}

}
