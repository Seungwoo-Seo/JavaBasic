package javaBasic2_3;

public class String2 {

	public static void main(String[] args) {
		String requestUri = "web/update/123";
		//마지막 / 다음에 123을 추출해서 정수로 변환해서 출력
		//String 의 메소드와 문자열을 숫자로 변환하는 메소드를 이용
		
		//split 이용 - "/"로 분할
		String[] arr = requestUri.split("/");
		int num = Integer.parseInt(arr[arr.length-1]);
		System.out.printf("num:%d\n", num);
		
		//substring 이용
		//마지막 /의 위치 찾기
		int idx = requestUri.lastIndexOf("/");
		String articleNum = requestUri.substring(idx + 1);
		System.out.printf("num:%s\n", articleNum);
		
		
		String password = "Dokki1000Dki!";
		//password 에서 대문자의 개수 세기
		//글자 단위로 가져와서 'A' 보다 크거나 같고  'Z' 보다 작거나 같은
		//데이터의 개수를 세면 됩니다.
		int upperCnt = 0;
		int len = password.length();
		
		for(int i=0; i<len; i++) {
			char ch = password.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				upperCnt++;
			}
		}
		System.out.printf("대문자 개수:%d\n", upperCnt);
		
		//password 에서 대문자도 아니고 소문자도 아니고 숫자도 아닌
		//데이터의 개수를 세기
		int etcCnt = 0;
		
		for(int i=0; i<len; i++) {
			char ch = password.charAt(i);
			if(!(ch >= 'A' && ch <= 'Z' || 
			   ch >= 'a' && ch <= 'z' ||
			   ch >= '0' && ch <= '9')) {
				etcCnt++;
			}
		}
		System.out.printf("특수 문자 개수 : %d\n", etcCnt);
		
		
		
		String data = "GDNDFGCCGGKDLGCCGCCGJKDCGCCGFD";
		//위의 문자열에서 GCCG가 존재하는 곳의 시작 위치를 전부 출력하시오.
		//단 한 번 조회된 영역은 다시 조회하지 않도록 하시오.
		//메소드는 length 와 charAt 만 사용하시오.
		//정답 : 5 13 24
		
		for(int i=0; i<data.length(); i++) {
			if('G' == data.charAt(i)) {
				if('C' == data.charAt(i+1)) {
					if('C' == data.charAt(i+2)) {
						if('G' == data.charAt(i+3) && 'J' != data.charAt(i+4)) {
							System.out.printf("%-3d", i);
						}
					}
				}
			}
		}
		
		
		String anagram = "EROS";

		//위의 문자열의 아나그램을 전부 출력
		//ROSE, OSER, SERO 
		
		
		
		
	}
	
}
