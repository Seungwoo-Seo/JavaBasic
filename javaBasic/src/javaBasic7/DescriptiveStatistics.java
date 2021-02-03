package javaBasic7;

public class DescriptiveStatistics {

	public static void main(String[] args) {
		//이름 배열
		String [] names = {
			"종로", "신촌", "강남", "홍대", "목동", "건대"
		};
		//정수 배열 만들기
		int [] scores = {98, 78, 99, 65, 87, 93};
		
		//90점이 넘는 데이터의 합계와 개수 그리고 평균을 구하기
		//평균은 소수 첫째자리까지 구하기 - 소수 두째 자리에서 반올림
		
		//합계를 저장할 변수와 개수를 구할 변수를 생성
		int sum = 0;
		int cnt = 0;
		
		//배열 순회
		for(int score : scores) {
			//90이 넘는 데이터를 만나면 score는 sum에 추가
			//개수는 1증가
			if(score > 90) {
				sum = sum + score;
				cnt = cnt + 1;
			}
		}
		
		//합계와 개수 출력
		System.out.printf("90이 넘는 합계:%d\n", sum);
		System.out.printf("90이 넘는 개수:%d\n", cnt);
		
		//평균
		//나누기를 할 때는 나누는 수가 0인지 확인하고 작업
		if(cnt == 0) {
			System.out.printf("조건에 맞는 데이터가 없습니다.\n");
		}else {
			//소수 부분을 구하기 위해서 sum을 double로 형변환해서 수행
			double avg = (double)sum / cnt;
			//소수 2째 자리에서 반올림해서 출력하기 위해서
			//실수 출력 형식을 .1f로 설정
			System.out.printf("90이 넘는 데이터의 평균:%.1f\n",
					avg);
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
		System.out.printf("최대값:%d\n", max);
		System.out.printf("최소값:%d\n", min);
		
		
		//score 가 가장 높은 name을 찾기
		
		//가장 높은 score를 저장하기 위한 변수
		int maxScore = 0;
		//가장 높은 score의 name을 저장할 변수를 생성
		String maxName = "";
		
		//배열을 순회하면서
		//빠른 열거를 사용하지 않은 이유는 2개의 배열을 이용하기 때문
		for(int i=0; i<scores.length; i=i+1) {
			//i 번째 score를 score에 대입
			int score = scores[i];
			//i 번째 name을 대입
			String name = names[i];
			
			//배열 안의 값과 최대값을 비교해서 
			//배열 안의 값이 최대값보다 크면 최대값을 배열 안의 값으로 변경
			if(maxScore < score) {
				maxScore = score;
				//가장 큰 값이 변경될 때 그 때의 
				//name으로 maxName을 변경
				maxName = name;
			}
		}
		System.out.printf("가장 큰 장소:%s 큰 값:%d\n",
				maxName, maxScore);

		//score가 80에 가장 가까운 데이터와 그 데이터의 name을 조회
		//가까운 데이터를 찾을 때는 차이가 제일 적은 데이터를 찾아야 합니다.
		//차이는 음수가 없습니다.
		//모든 데이터의 차이를 구해서 그 차이가 최소인 데이터를 찾아야 합니다.
		//스마트 폰 애플리케이션 등에서 가까운 곳 찾기에 많이 사용
		
		//차이가 가장 작은 값을 저장할 변수
		int minDistance = 100;
		//차이가 가장 작은 이름을 저장할 변수
		String minName = "";
		for(int i=0; i<scores.length; i=i+1) {
			//i 번째 score를 score에 대입
			int score = scores[i];
			String name = names[i];
			
			//80 과 score의 차이를 구해야 합니다.
			int distance = score - 80;
			//거리는 음수가 없기 때문에 음수가 나오면 -1을 곱해서
			//양수를 만들어야 합니다.
			if(distance < 0) {
				distance = distance * -1;
			}
			
			//distance 가 가장 작은 데이터 찾기
			if(minDistance > distance) {
				minDistance = distance;
				minName = name;
			}
		}
		
		//출력하기
		System.out.printf("80에 가장 가까운 이름:%s\n",
				minName);
		
	}

}

