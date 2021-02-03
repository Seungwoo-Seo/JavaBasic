package javaBasic2;

public class DataType {
	
	public static void main(String[] args) {
	
		char ch = 'A' + 3;
		int i = 'A' + 3;
		//문자 변수에 저장해서 D
		System.out.println("ch:" + ch);
		//정수 변수에 저장해서 68
		System.out.println("i:" + i);
		//문자열과 숫자를 더하기 하면 결합 A1
		String str = "A" + 1;
		System.out.println("str: " + str);
		
		//대문자와 소문자 아스키코드 차이는 32
		//ex) A + 32 = a, a - 32 = A
		
		//overflow
		int result = 2100000000 + 1000000000;
		System.out.println("result: " + result);
		
		//0.1을 100번 더했는데 10.0이 아닌 결과를 출력
		//표현상의 한계 때문에 이런 결과가 나옵니다.
		double sum = 0.0;
		for(int k=0; k<100; k++) {
			sum = sum + 0.1;
		}
		System.out.println("sum:" + sum);
		
				
		
	}
}
