package javaBasic6;

public class DescriptiveStatistics {

	public static void main(String[] args) {
		//이름 배열
		String[] names = {"종로", "신촌", "강남", "홍대", "목동", "건대"};
		//정수 배열 만들기
		int[] scores = {98, 78, 99, 65, 87, 93};
		
		//90점이 넘는 데이터의 합계와 개수 그리고 평균을 구하기
		//평균은 소수 첫째자리까지 구하기 - 소수 둘째 자리에서 반올림
		
		//합계를 저장할 변수와 개수를 구할 변수를 생성
		int sum = 0;
		int count = 0;
		
		//배열 순회
		for(int score : scores) {
			if(score>90) {
				sum = sum + score;
				count = count + 1;
			}
		}
		
		//합계와 개수 출력
		System.out.println("90이 넘는 합계 : " + sum);
		System.out.println("90이 넘는 개수 : " + count);
		
		//평균 구하기
		//나누기를 할 때는 나누는 수가 0인지 확인하고 작업
		if(count == 0) {
			System.out.println("조건에 맞는 데이터가 없습니다.");
		} else {
			//소수 부분을 구하기 위해서 sum을 double로 형변환해서 수행
			double avg = (double)sum / count;
			//소수 2째 자리에서 반올림해서 출력하기 위해서
			//실수 출력 형식을 .1f로 설정
			System.out.printf("90이 넘는 데이터의 평균 : %.1f\n", avg);
		}
		
		//최대값과 최소값 구하기
		//최대값을 저장할 변수를 생성 - 아주 작은 값이나 배열의 첫번째 값으로 초기화
		int max = 0;
		//최소값을 저장할 변수를 생성 - 아주 큰 값이나 배열의 첫번째 값으로 초기화
		int min = 100;
		//배열을 순회하면서 max 나 min보다 큰 값이나 작은 값을 만나면 그 값으로 교체
		for(int score : scores) {
			//최대값
			if(max < score) {
				max = score;
			}
			//최소값
			if(min > score) {
				min = score;
			}
		}
		System.out.printf("최대값 : %d\n최소값 : %d\n", max, min);
		

	}

}
