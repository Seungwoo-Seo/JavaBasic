package javaBasic1_5;

public class ForTest {

	public static void main(String[] args) {
		//1부터 100까지 더한 합을 for를 이용해서 작성
		
		//합계를 저장할 변수
		int sum = 0;
		//i가 1부터 100이 될 때 까지 1씩 증가시켜서 sum에 더하기
		for(int i=1; i<=100; i=i+1) {
			sum = sum + i;
		}
		System.out.println("sum : " + sum);
		
		
	}
	
}
