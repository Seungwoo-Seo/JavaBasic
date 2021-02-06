package javaBasic1_4;

public class Practice {

	public static void main(String[] args) {
		//사용자가 복사할 매수를 입력하면
		//1~100 까지는 장당 50원
		//101~1000 까지는 장당 40원
		//그 이상은 장당 30원으로 계산해서
		//총금액을 출력하는 프로그램을 작성
		
		//1.복사할 매수 입력 받기 - Scanner
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		System.out.printf("복사할 매수 입력:");
		int cnt = sc.nextInt();
		
		//2.한 장당 가격을 설정 - if
		int unitprice = 0;
		if(cnt >= 1 && cnt <= 100) {
			unitprice = 50;
		}else if(cnt >= 101 && cnt <= 1000) {
			unitprice = 40;
		}else {
			unitprice = 30;
		}
		
		//3.금액을 계산 - 연산자
		int money = cnt * unitprice;
		
		//4.금액을 출력 - 출력하기
		System.out.printf("금액은 %d원 입니다.\n",
				money);		
		

	}

}
