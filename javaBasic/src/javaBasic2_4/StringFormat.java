package javaBasic2_4;

public class StringFormat {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		//x:100탭y:200 형태로 출력하기
		//String.format은 문자열을 만들어 주는 것이고
		//printf는 화면에 출력해줍니다.
		String display = String.format("x:%d\ty:%d\n", x, y);
		System.out.printf(display);
		
		System.out.printf("x:%d\ty:%d\n", x, y);
		
	}

	
}
