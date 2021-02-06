package javaBasic1_3;

public class Arithmetic {

	public static void main(String[] args) {
		//사칙연산 연습
		
		//int 보다 작은 자료형으로 연산하면 int로
		//변경해서 수행
		byte b1 = 10;
		byte b2 = 20;
		//형 변환하지 않으면 에러
		//작은 자료형의 변수에 큰 자료형의 데이터가 저장 불가하기 때문
		//byte + byte = int이기 때문
		byte result = (byte)(b1 + b2);
		
		System.out.println("result: " + result);
		
		//동일한 자료형끼리 연산을 수행하면 결과도 그 자료형으로 리턴됩니다.
		//2.5 가 아니라 2
		System.out.println("result: " + (10/4));
		//서로 다른 자료형끼리 연산을 하면 더 큰 크기의 자료형으로 변환해서 연산을 수행
		//실수와 정수를 연산하는 거라서 실수/실수로 변경해서 수행하여 결과가 2.5
		System.out.println("result: " + (10.0/4));
		
		int score1 = 20;
		int score2 = 30;
		int score3 = 30;
		
		//3개 데이터의 평균을 소수 첫째 자리까지 구하기
		//둘째 자리에서 반올림
		//26.7 형태로 결과가 나오도록 합니다.
		int sum = score1 + score2 + score3;
		double avg = (double)sum / 3;
		
		//소수 둘째 자리에서 반올림
		//avg = ((int)(avg*10 + 0.5))/10.0;		--> 반올림 알고리즘
		System.out.printf("%.1f\n", avg);
	}
	
}
