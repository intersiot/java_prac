package javastudy100;

import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {
		// 자동차 높이 170
		// 터널 3개 통과
		// 통과: pass, 충돌: crash
		
		Scanner scan = new Scanner(System.in);
		
		int[] tunnel = new int[3];
		
		System.out.println("터널 높이: ");
		for (int i = 0; i < tunnel.length; i++) {
			tunnel[i] = scan.nextInt();
			
			if (tunnel[i] <= 170) {
				System.out.println("충돌! 터널 높이: " + tunnel[i]);
				break;
			} else {
				System.out.println("통과! 터널 높이: " + tunnel[i]);
			}
		}
		
		
		
		
	}

}
