package javastudy100;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a�� ���� �Է��ϼ���: ");
		int a = scan.nextInt();
		System.out.print("b�� ���� �Է��ϼ���: ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("0");
		} else if (a <= b) {
			System.out.println("1");
		}

	}

}
