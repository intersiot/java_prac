package javastudy100;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a�� ���� �Է��ϼ���: ");
		int a = scan.nextInt();
		System.out.print("b�� ���� �Է��ϼ���: ");
		int b = scan.nextInt();
		
		if (a == b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
