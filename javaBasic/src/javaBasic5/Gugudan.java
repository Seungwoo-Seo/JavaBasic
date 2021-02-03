package javaBasic5;

public class Gugudan {

	public static void main(String[] args) {
		//반복문의 중첩을 이용한 구구단 출력
		for(int j=2; j<=9; j++) {
			//2단 만들기
			for(int i=1; i<=9; i=i+1) {
				System.out.printf("%d * %d =%3d\n", j, i, 2*i);
			}
		}

	}

}
