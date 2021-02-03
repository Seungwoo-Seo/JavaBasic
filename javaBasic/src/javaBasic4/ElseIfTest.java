package javaBasic4;

public class ElseIfTest {

	public static void main(String[] args) {
		
		int score = 77;
		//90이상이면 A, 80이상이면 B, 70이상이면 C
		//60이상이면 D 그 이외는 F
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
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
		//id가 root 이고 pw가 system 이면 로그인 성공
		//id가 root 이고 pw가 system 아니면 비밀번호틀림
		//id가 root 가 아니면 잘못된 id 라고 출력
		if(id.equals("root")
				&& pw.equals("system")) {
			System.out.println("로그인 성공");
		}else if(id.equals("root") && 
				!pw.equals("system")) {
			System.out.println("잘못된 비밀번호");
		}else {
			System.out.println(
					"잘못된 아이디 입니다.");
		}
		
	}

}
