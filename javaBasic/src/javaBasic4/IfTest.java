package javaBasic4;

public class IfTest {

	public static void main(String[] args) {
		
		int su = 23;
		//숫자가 짝수이면 짝수라고 출력하기
		if(su % 2 == 0) {
			System.out.println("짝수");
		}
		
		//숫자가 짝수라면 짝수라고 출력하고 아니면
		//홀수라고 출력하기
		if(su % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		//아이디와 비밀번호를 입력받아서 아이디가
		//root 이고 비밀번호가 system 이면
		//로그인 성공이라고 출력하고 
		//그렇지 않으면 로그인 실패라고 출력하기
		
		//1.아이디와 비밀번호를 입력받기 - Scanner
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		//아이디 입력받기
		System.out.printf("아이디를 입력하세요:");
		String id = sc.nextLine();
		//비밀번호 입력받기
		System.out.printf("비밀번호를 입력하세요:");
		String pw = sc.nextLine();
		
		sc.close();
		
		//2.아이디와 비밀번호를 비교해서 처리
		//숫자 데이터나 boolean 데이터는 == 로 일치하는지
		//확인하지만 문자열은 equals를 이용해서 검사
		if(id.equals("root") && 
				pw.equals("system")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
	}

}
