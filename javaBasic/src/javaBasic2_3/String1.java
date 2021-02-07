package javaBasic2_3;

public class String1 {

	public static void main(String[] args) {
		//String 클래스의 인스턴스 생성
		String st = "abcdefg";
		
		//2번째 문자 출력
		char ch = st.charAt(1);
		System.out.printf("%c\n", ch);
		//문자열의 길이 출력
		int len = st.length();
		System.out.printf("문자열 길이:%d\n", len);
		
		//문자 1개씩 출력
		for(int i=0; i<len; i++) {
			System.out.printf("%c\n", st.charAt(i)); 
		}
		
		String rv1 = "ggangpae1@gMail.com";
		String rv2 = "ggangpae1@kakao.com";
		
		//rv1 과 rv2 에 gmail이 포함되어 있는지 판별
		//대소문자는 구별하지 않음
		
		if(rv1.toLowerCase().indexOf("gmail".toLowerCase()) >= 0) {
			System.out.println("rv1 에 gmail이 있습니다.");
		} else {
			System.out.println("rv1 에 gmail이 없습니다.");
		}
		
		if(rv2.toLowerCase().indexOf("gmail".toLowerCase()) >= 0) {
			System.out.println("rv2 에 gmail이 있습니다.");
		} else {
			System.out.println("rv2 에 gmail이 없습니다.");
		}
		
		
	}
	
}
