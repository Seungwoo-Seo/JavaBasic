package javaBasic3;

public class Unary {

	public static void main(String[] args) {
		//변수 선언
		boolean result = true;
		int x = 10;
		
		//!을 붙이면 반대로 결과를 리턴합니다.
		System.out.println("!result = " + (!result));
		
		//증감 연산자 사용
		x++; //변수의 값을 1증가
		System.out.println("x++ : " + x); //11
		
		//명령어 안에서 증감
		
		//앞에 붙이면 증감을 먼저하고 명령어에 사용
		System.out.println(++x); //12
		//명령어에 사용을 하고 증감을 수행
		//출력을 하고 증감을 하기 때문에 12를 출력하고
		//x는 13이 됩니다.
		System.out.println(x++); //12
		
		System.out.println(x); //13
		
	}
	
}
