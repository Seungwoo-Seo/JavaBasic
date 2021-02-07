package javaBasic2_2;

public class BubbleSort {

	public static void main(String[] args) {
		//정수 배열을 생성
		int[] arr = {20, 24, 17, 26, 22};
		
		//bubble sort
		//데이터 개수가 n 개라고 하면
		//최대 n-1 회전 동안
		//첫번째 부터 (n-1)-회전수 까지 자신의 뒤에 있는 데이터와
		//비교해서 정렬하는 방식
		int n = arr.length;
		for(int i=0; i<n-1; i=i+1) {
			for(int j=0; j<n-i-1; j=j+1) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			//중간 과정을 확인해보기 위해서 반복문 중간에 출력
			for(int temp : arr) {
				System.out.printf("%-5d", temp);
			}
			System.out.println();
		}
		
		
		//정렬 후의 결과를 출력
		System.out.print("정렬된 int[] arr : ");
		for(int ar : arr) {
			System.out.printf("%-3d", ar);
		}
		System.out.println();
		
		
	}
	
}
