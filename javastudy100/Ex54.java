package javastudy100;

import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a입력:");
		int a = scan.nextInt();
		System.out.println("b입력:");
		int b = scan.nextInt();
		
		if (b % a == 0) {
			System.out.println(a + " * x = " + b);
		} else if (a % b == 0) {
			System.out.println(b + " * x = " + a);
		} else {
			System.out.println("none");
		}
	}
	
}
