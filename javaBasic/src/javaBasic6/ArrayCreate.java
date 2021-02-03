package javaBasic6;

public class ArrayCreate {

	public static void main(String[] args) {

		//이름 배열을 생성과 동시에 초기화
		String[] names = {"철수", "영희", "짱구", "순희"};
		//몸무게 3개를 저장할 수 있는 배열을 만들고 값을 대입
		double[] weight = new double[4];
		weight[0] = 70.5;
		weight[1] = 49.4;
		weight[2] = 64.7;
		weight[3] = 51.2;
		
		//반복문을 사용하면 유지보수가 수월 해짐
		//for(int i=0; i<3; i=i+1) {
		//	System.out.printf("%s는 %.1fkg입니다.\n ", names[i], weight[i]);
		//}
		
		//3이라고 배열의 데이터 개수를 설정하는 부분을 수정
		//배열의 속성으로 설정
		//데이터가 변경이 되도 출력하는 부분을 수정할 필요가 없어집니다.
//		for(int i=0; i<weight.length; i=i+1) {
//			System.out.printf("%s는 %.1fkg입니다.\n ", names[i], weight[i]);
//		}
		
		// .으로 접근하거나 [인덱스]로 데이터를 접근하게 되면
		//메모리를 한번 더 찾아가야 합니다.
		//반복문 등에서 동일한 데이터를 여러 번 . 이나  [인덱스]를
		//이용해서 찾아가게 되면 비효율적
		//이런 경우에는 이 데이터를 가까운 곳에 저장해두고
		//접근하는 것이 좋습니다.	--> 배열의 값들은 Heap영역에 저장되고 그 Heap영역에 있는 모든 배열의 값들의 개수를 세는게 .length이기 때문에
		//stack 영역에 선언되어 있는 int n에 weight.length의 값을 저장하면 반복문이 계속 Heap영역까지 가지 않아도 되기 때문에 효율적이다
		int n = weight.length;
		for(int i=0; i<n; i=i+1) {
			System.out.printf("%s는 %.1fkg입니다.\n ", names[i], weight[i]);
		}
	}

}
