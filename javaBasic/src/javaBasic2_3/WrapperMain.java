package javaBasic2_3;

public class WrapperMain {

	public static void main(String[] args) {

		//Auto Boxing - 기본형 데이터를 Wrapper Class
		//타입의 변수에 바로 대입
		Double d = 10.7;
		
		//문자열을 정수로 변환
		int i = Integer.parseInt("87");
		
		//변환이 안되는 문자열을 대입하면 
		//NumberFormatException 발생
	 	i = Integer.parseInt("10.8");	//NumberFormatException 에러
	 	
	 	//GUI 환경에서는 숫자 데이터를 사용할 수 없음
		//입력과 출력 모두 문자열로 해야 합니다.
	}
	
}
