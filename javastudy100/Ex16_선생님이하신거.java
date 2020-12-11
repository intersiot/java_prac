package javastudy100;

import java.util.Scanner;

public class Ex16_선생님이하신거 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		System.out.printf("%o", i);
		System.out.println(Integer.toOctalString(i));
		
		//	10����		8����		16����						2����
		// 0,1,..,9		0 ~ 7		0..9,A(10),B,C,D,E,F(15)	0,1
		// 10...99		10 ~ 77		10..FF						10,11
		// 100			100			100							100
		// 10�̵Ǹ�		8�̵Ǹ�		16�̵Ǹ�					2���Ǹ�
		// �ڸ�����		�ڸ�����	�ڸ������ö󰣴�.			�ڸ����� �ö󰣴�.
		// �ö󰣴�.	�ö󰣴�.
		
	}

}
