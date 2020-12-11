package javastudy100;

import java.util.Scanner;

public class Ex18_선생님이하신거 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 입력 : 문자열, 정수, 실수
		System.out.println("�Է�: ");
		String str = scan.nextLine();
		// 문자열에서 문자 한 개(첫번째)를 가져온다.
		char c = str.charAt(0);
		
		System.out.println(c);
		System.out.println((int) c);
	}

}
