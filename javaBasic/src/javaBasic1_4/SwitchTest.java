package javaBasic1_4;

public class SwitchTest {

	public static void main(String[] args) {
		
		//menu가 1번이면 중식 2번이면 한식 3번이면 분식
		//을 출력하고자 합니다.
		//이 문제는 if로도 해결이 가능합니다.
		int menu = 1;
		//가독성을 높이기 위한 final 변수 - 값을 변경 못함
		final int CHINA = 1;
		final int KOREA = 2;
		final int SNACK = 3;
		
		switch(menu) {
		case CHINA:
			System.out.printf("중식\n");
			break;
		case KOREA:
			System.out.printf("한식\n");
			break;
		case SNACK:
			System.out.printf("분식\n");
			break;
		default :
			System.out.printf("잘못된 메뉴\n");
			break;
		}
		

	}

}
