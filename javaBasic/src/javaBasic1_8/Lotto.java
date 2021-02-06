package javaBasic1_8;

public class Lotto {

	public static void main(String[] args) {
		// 로또 번호 6개를 저장할 배열을 생성
		// 로또 번호는 정수
		int[] lotto = new int[6];

		// 6개의 정수를 입력받아서 lotto 배열에 저장
		// Scanner를 이용할 수 있어야 합니다.

		// 키보드로부터 입력받기 위한 인스턴스 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int len = lotto.length;
		for (int i = 0; i < len; i = i + 1) {
			System.out.printf("1-45사이의 숫자를 중복되지 않게 입력하세요:");
			lotto[i] = sc.nextInt();

		}

		sc.close();

		// lotto 배열에 저장된 데이터를 출력
		for (int temp : lotto) {
			System.out.printf("%5d", temp);
		}
		System.out.printf("\n");

	}

}
