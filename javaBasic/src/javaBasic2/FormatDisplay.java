package javaBasic2;

public class FormatDisplay {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 3;
//		System.out.printf("%2d\n", a);
//		System.out.printf("%2d\n", b);
		
		//웹툰 요일 (문자열)
		//웹툰 순위 (정수)
		//웹툰 제목 (문자열)
		//웹툰 작가 (문자열)
		//웹툰 회차 (정수)
		
		
		String day = "목요일";
		int ranking = 4;
		String wedtoonName = "더 복서";
		String writer = "정지훈";
		int round = 46;
		
		String day1 = "수요일";
		int ranking1 = 1;
		String wedtoonName1 = "헬퍼2";
		String writer1 = "삭";
		int round1 = 246;
		
		System.out.printf(
				"%10s%10s%10s%10s%10s\n",
				"웹툰 요일", "웹툰 순위", "웹툰 제목", "웹툰 작가", "웹툰 회차");
		System.out.printf(
				"%10s%12d위%14s%11s%12d회\n",
				day, ranking, wedtoonName, writer, round);
		System.out.printf(
				"%10s%12d위%14s%11s%12d회",
				day1, ranking1, wedtoonName1, writer1, round1);
		
	}
	
}
