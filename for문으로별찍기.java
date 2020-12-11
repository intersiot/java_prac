
public class for문으로별찍기 {

	public static void main(String[] args) {
		
		int i;	// 행
		int j;	// 열
		
		// 사각형 찍기
		for ( i = 1; i <= 3; i++ ) { // 5만큼의 줄 생성
			for ( j = 1; j <= 3; j++ ) { // 줄마다 5만큼 반복실행
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();
		
		// 왼쪽 정렬 직삼각형 찍기
		for ( i = 1; i <= 3; i++ ) { // 5만큼의 줄 생성
			for ( j = 1; j <= i; j++ ) { // 행(i)의 순서만큼 (첫번째 줄이면1, 두번째 줄이면2 ...) 반복
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();
		
		// 왼쪽 정렬 역 직삼각형 찍기
		for ( i = 1; i <= 3; i++ ) { // 5만큼의 줄 생성
			for ( j = 3; j >= i; j-- ) { // 행(i)의 순서만큼 반복하는데 반대로 되야됨.
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println();
		
		// 오른쪽 정렬 직삼각형 찍기
		for ( i = 1; i <= 3; i++ ) {
			for ( j = 3; j > 0; j-- ) {
				if ( j > i ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
