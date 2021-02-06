package javaBasic1_4;

public class ConsoleInput {

	public static void main(String[] args) {
		
		//키보드로부터 입력받는 Scanner 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//이름 입력받기
		System.out.print("이름입력:");
		String name = sc.nextLine();
		System.out.printf("이름:%s\n", name);
		
		//점수를 입력받기
		System.out.print("점수입력:");
		int score = sc.nextInt();
		System.out.printf("점수:%d\n", score);
		
		//숫자 다음에 문자열을 입력 받을 때는
		//버퍼를 비우기 위해서 한 번 호출을 해야 합니다.
		sc.nextLine();
		
		//주소를 입력받기
		System.out.print("주소입력:");
		String address = sc.nextLine();
		System.out.printf("주소:%s\n", address);
		
		//스캐너 종료
		sc.close();
		
		
	}

}
