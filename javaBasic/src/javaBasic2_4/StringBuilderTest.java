package javaBasic2_4;

public class StringBuilderTest {

	public static void main(String[] args) {
		//비어 있는 StringBuilder 클래스의 인스턴스를 생성
		StringBuilder sb = new StringBuilder();
		
		//문자열 추가
		sb.append("레드벨벳 ");
		sb.append("블랙핑크");
		
		//sb의 내용을 갖는 String 인스턴스를 생성
		String msg = sb.toString();
		//출력
		System.out.printf("%s\n", msg);
		
		//한 글자 씩 줄단위로 출력
		int len = msg.length();
		for(int i=0; i<len; i=i+1) {
			char ch = msg.charAt(i);
			System.out.printf("%c\n", ch);
		}	

	}
	
}
