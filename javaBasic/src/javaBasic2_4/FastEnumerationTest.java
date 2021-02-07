package javaBasic2_4;

public class FastEnumerationTest {

	public static void main(String[] args) {
		String[] girlGroups = {"레드벨벳", "블랙핑크", "원더걸스", "소녀시대", "핑클", "SES"};
		//위의 내용을 순서대로 줄 단위로 출력
		
		//인덱스를 활용하는 방법
		int len = girlGroups.length;
		for(int i=0; i<len; i++) {
			System.out.printf("%s\n", girlGroups[i]);
		}
		
		//빠른 열거를 이용하는 방법
		for(String imsi : girlGroups) {
			System.out.println(imsi);
		}
		
	}
	
}
