package javaBasic7;

public class SelectionSort {

	public static void main(String[] args) {
		//정렬할 배열을 생성
		int [] ar = {5, 1, 3, 2, 4};
		
		//데이터를 출력
		System.out.printf("초기상태:");
		for(int temp : ar) {
			System.out.printf("%5d", temp);
		}
		System.out.printf("\n");
		
		//선택 정렬
		for(int i=0; i<ar.length-1; i=i+1) {
			for(int j=i+1; j<ar.length; j=j+1) {
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.printf("%d pass:", i);
			for(int temp : ar) {
				System.out.printf("%5d", temp);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("정렬결과:");
		for(int temp : ar) {
			System.out.printf("%5d", temp);
		}
		System.out.printf("\n");
	}

}
