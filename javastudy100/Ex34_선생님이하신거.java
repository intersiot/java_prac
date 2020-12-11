package javastudy100;

import java.util.Scanner;

public class Ex34_선생님이하신거 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력해주세요:");
		while (true) { // 무한 루프, while의 조건을 true로 주면 됨.
			int i = scan.nextInt();
			if (i == 0) { // 탈출 조건
				break;
			}
			System.out.println(i);
		}
		System.out.println("종료됨.");
		
		// 조건문 if문 연습
		// 조건문의 형태
		// 패턴1. 단순(단일) if문
		if (true) {
			
		}
		// 패턴2. if else문
		if (false) {
			
		} else {
			
		}
		// 패턴3. if else if문
		if (false) {
			
		} else if (true) {
			
		} else { // 이부분은 써도 되고 안 써도 된다.
			
		}
		// 패턴4. 중첩 if문 (if문 안에 if문이 들어가는 패턴)
		if (true) {
			if (false) {
				
			} else if (true) {
				
			}
		} else {
			
		}
		
	}

}
