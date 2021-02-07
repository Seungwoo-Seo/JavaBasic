package javaBasic2_2;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		//1. java.lang.Math 클래스에 가면 random 이라는 메소드가 있는데 이 메소드는 0.0
		//부터 1.0 사이의 실수를 랜덤하게 리턴해주는 메소드입니다.
		//이 메소드 이용해서 0.0 에서 1.0 사이의 숫자를 3개 정도 출력해보기
		
		for(int i=0; i<3; i++) {
			double rn = Math.random();
			System.out.printf("랜덤숫자 %d : %.3f\n", i+1 ,rn);
		}
		
		//2. java.lang.Integer 클래스에 가면 parselnt 라는 메소드가 있는데 이 메소드는 정수로
		//된 문자열을 대입하면 정수로 변환해주는 메소드입니다.
		//"109" 과 "19" 2개의 문자열을 정수로 변환해서 합계를 구해보세요
		
		int num1 = Integer.parseInt("109");
		int num2 = Integer.parseInt("19");
		
		System.out.println(num1 + num2);
		
		//3. java.util.Date 클래스의 인스턴스를 매개변수가 없는 생성자를 이용해서 생성하면
		//현재 시간으로 초기화가 됩니다.
		//toString 메소드를 호출하면 문자열로 변환이 가능합니다.
		//현재 시간을 Date 클래스를 이용해서 출력하기
		
		Date date = new Date();
		
		System.out.println(date);
		System.out.println(date.toString());
		
		
		
	}

}
