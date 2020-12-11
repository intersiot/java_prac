package javastudy100;

import java.util.Scanner;

public class Ex59 {

	public static void main(String[] args) {
		// 로또 당첨번호랑 입력번호 비교
		
		// 로또 번호 입력
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[6];
		
		System.out.println("입력:");
		
		int lottoNum1 = scan.nextInt();
		lotto[0] = lottoNum1;
		int lottoNum2 = scan.nextInt();
		lotto[1] = lottoNum2;
		int lottoNum3 = scan.nextInt();
		lotto[2] = lottoNum3;
		int lottoNum4 = scan.nextInt();
		lotto[3] = lottoNum4;
		int lottoNum5 = scan.nextInt();
		lotto[4] = lottoNum5;
		int lottoNum6 = scan.nextInt();
		lotto[5] = lottoNum6;

		for (int i = 0; i < lotto.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(lotto[i]);
		}
		
		// 당첨번호 난수로 생성시키기
		int[] number = new int[6];
		for (int i= 0; i < number.length; i++) {
			number[i] = (int)(Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("\n이번 당첨번호: ");
		
		for (int i = 0; i < number.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(number[i]);
		}
		
	}

}
