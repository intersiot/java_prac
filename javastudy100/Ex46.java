package javastudy100;

import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int car = 170; // 자동차의 높이
		int tunnel[] = new int [3]; // 3개의 터널을 지나야함 -> 값이 3개 있는 배열
		
		for (int i = 0; i < tunnel.length; i++ ) {
			System.out.println();
			tunnel[i] = scan.nextInt(); // 터널의 높이를 입력받음
			
			if (tunnel[i] <= 170) { // 170 이하의 경우 충돌
				System.out.println("crash");
			} else { // 아닐 경우 지나감
				System.out.println("pass");
			}
		}
		
	}

}
