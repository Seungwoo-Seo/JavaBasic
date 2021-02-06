package javaBasic1_3;

public class Pattern {

	public static void main(String[] args) {
		//초를 받아서 몇 시간 몇 분 몇 초인지 출력하기
		int s = 4700;
		int hour = s / 3600; //1시간은 3600초
		int minute = (s - hour * 3600) / 60;
		//분은 시간은 빼고
		//나머지를 가지고 60으로 나누기
		int second = s % 60;
		System.out.printf("%2d시간%2d분%2d초",
				hour, minute, second);
			
	}
	
}
