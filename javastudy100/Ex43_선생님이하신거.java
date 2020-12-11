package javastudy100;

import java.util.Scanner;

public class Ex43_선생님이하신거 {

	public static void main(String[] args) {
		// 정수로 입력받아서 문자열로 출력
		// 예시 12345 - > 일만이천삼백사십오
		String[] kors = {"일", "이", "삼", "사", "오", "육", "칠", "팔", "구", "십"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력");
		int n = scan.nextInt();
		
		// 자릿수 구하기
		int pos10000 = n/10000; // 1 -> 만의 자릿수
		int pos1000 = (n/1000) % 10; // 12 -> 천의 자릿수인 2만 받고 싶기 때문에 10으로 나머지 연산
		int pos100 = (n/100) % 10; // 123 -> 3 백의 자릿수
		int pos10 = (n/10) % 10; // 1234 -> 4 십의 자릿수
		int pos1 = n % 10; // 5, 일의 자릿수
		
		// 한글로 출력하기
		// 만의 자릿수 출력
		// 자릿수가 없을때는 if문을 사용해서 자릿수가 있을 때만 출력하도록.
		if (pos10000 != 0) {
			System.out.print(kors[pos10000 - 1]);
			System.out.print("만");
		}
		// 천의 자릿수 출력
		if (pos1000 != 0) {
			System.out.print(kors[pos1000 - 1]);
			System.out.print("천");
		}
		// 백의 자릿수 출력
		if (pos100 != 0) {
			System.out.print(kors[pos100 - 1]);
			System.out.print("백");
		}
		// 십의 자릿수 출력
		if (pos10 != 0) {
			System.out.print(kors[pos10 - 1]);
			System.out.print("십");
		}
		// 일의 자릿수 출력
		if (pos1 != 0) {
			System.out.print(kors[pos1 - 1]);
		}
		
	}

}
