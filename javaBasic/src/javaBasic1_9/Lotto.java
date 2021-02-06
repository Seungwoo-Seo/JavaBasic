package javaBasic1_9;

public class Lotto {
	
	public static void main(String[] args) {
		//로또 번호 6개를 저장할 배열을 생성
		//로또 번호는 정수
		int [] lotto = new int[6];
		
		//6개의 정수를 입력받아서 lotto 배열에 저장
		//Scanner를 이용할 수 있어야 합니다.
		
		//키보드로부터 입력받기 위한 인스턴스 생성
		java.util.Scanner sc = 
			new java.util.Scanner(System.in);
		
		int len = lotto.length;
		for(int i=0; i<len; i=i+1) {
			System.out.printf(
				"1-45사이의 숫자를 중복되지 않게 입력하세요:");
			lotto[i] = sc.nextInt();
			
			//1부터 45 사이인지 검사해서
			//1부터 45 사이가 아니면 경고 메시지를 출력하고 
			//무효화 시키는 코드를 작성
			//if(lotto[i] < 1 || lotto[i] > 45) 
			
			if(!(lotto[i] >=1 && lotto[i] <= 45)){
				System.out.printf(
					"1-45 사이의 숫자를 입력하세요!!!\n");
				i = i - 1;
				continue;
			}
			
			//중복 검사
			//두번째 데이터부터 수행
			//첫번째 부터 자신의 바로 이전데이터까지 자신과 비교해서
			//값이 같은 데이터가 있으면 데이터 중복
			//이 경우에도 다시 입력하도록 해주어야 합니다.
			
			
		}
		
		sc.close();
		
		//lotto 배열에 저장된 데이터를 출력
		for(int temp : lotto) {
			System.out.printf("%5d", temp);
		}
		System.out.printf("\n");

	}
	
}
