package javastudy100;

import java.util.Scanner;

public class Ex21_선생님이하신거 {

	public static void main(String[] args) {		
		// << 연산자를 사용한다.
		// 쉬프트 산술연산자 >> <<
		// 00000001 << 1	1
		// 00000010 		2
		// 00000001 << 2	1
		// 00000100			4
		// 00001000 		8
		// 왼쪽으로: 곱셈, 오른쪽으로: 나눗셈
		// 맨끝에서 들어오는 수는 항상 이진수 0
		
		// 2의 보수: -1
		// 00000001 : 1
		// 11111110 : 1의 보수
		// 11111111 : 2의 보수 = 1의 보수 + 1 (+1을 하는 이유는 0을 양슴와 음수 중 어느쪽으로 보낼지 결정하기 위함)
		// 11111111 << 1: -1
		// 11111110 : -2
		// 11111111 << 2: -1
		// 11111100 : -4
		// 11111111 >> 1 : -1
		// 10111111 음수가 양수가 되면 안되기 때문에 음수인 상태를 유지하면서 연산
		
		// 쉬프트 비트 논리연산자 >>>
		// 끝에서 들어올 때
		// 11111111 >>> 1
		// 01111111
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a입력:");
		int a = scan.nextInt();
		System.out.println("b입력:");
		int b = scan.nextInt();
		
		int i = a << b;
		System.out.println("i: " + String.format("%8s",
				Integer.toBinaryString(i)).replaceAll(" ", "0"));
		
		System.out.println("i값은 " + i);
	}

}
