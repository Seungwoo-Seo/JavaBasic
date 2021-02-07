package javaBasic2_2;

import java.util.Random;
import java.util.UUID;

public class JavaAPI {

	public static void main(String[] args) {
		//java.util.Random 클래스의
		//nextInt라는 메소드를 이용해서 1-45 사이의 랜덤한 숫자
		//출력하기
		
		//1.java.util.Random 클래스를 찾아서 interface 나
		//abstract 클래스 인지 확인 - interface 나 abstract
		//이면 상속을 받거나 구현을 해야 하기 때문입니다.
		
		//2.nextInt 메소드의 리턴 타입 앞에 static이
		//있는지 확인
		//static이 있으면 바로 사용하고 없으면 인스턴스를 생성
		
		//3.static이 없으므로 인스턴스를 생성하기 위해서
		//constructor를 확인해서 적당한 생성자를 선택해서
		//인스턴스를 생성
		Random rd = new Random();
		
		//4.메소드의 매개변수를 확인해서 메소드를 호출
		//5.리턴 타입을 확인해서 결과를 저장
		int result = rd.nextInt(45) + 1;
		
		System.out.printf("result : %d\n", result);
		
		//java.util.UUID 클래스의 randomUUID 메소드를
		//이용해서 랜덤한 문자를 생성하고 toString 메소드를
		//이용해서 결과를 한 번 출력
		UUID uuid = UUID.randomUUID();
		System.out.printf("uuid : %s\n", uuid.toString());
		
	}
	
}
