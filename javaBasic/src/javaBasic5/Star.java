package javaBasic5;

public class Star {

	public static void main(String[] args) {
		/*
		 	1 ***** 1-5
		 	2 ***** 1-5
		 	3 ***** 1-5
		 	4 ***** 1-5
		 	5 ***** 1-5
		 	별 5개를 출력하고 줄 바꿈 하는 것을 5번 수행
		 	가로 방향이 안쪽 반복문이 되고
		 	세로 방향이 바깥쪽 반복문이 됩니다.
		 */
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<5; j=j+1) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		/*
	 		1*		1-1
	 		2**		1-2
	 		3***	1-3
	 		4****	1-4
	 		5*****	1-5
	 		*이 하나씩 증가하는 구조
	 		변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에
	 		곱한 후 더하기 빼기를 이용해서 결과를 맞추는 작업 수행
	 		1씩 증가하므로 1*i
		*/
		for(int i=0; i<5; i=i+1) {
			for(int j=i; j<=2*i; j=j+1) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		/*
		  	1 ***** 1-5
		  	2 ****  1-4
		  	3 ***   1-3
		  	4 **    1-2
		  	6 * 	  1-1
		 	*이 하나씩 감소하는 구조
		   	변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에
		   	곱한 후 더하기 빼기를 이용해서 결과를 맞추는 작업 수행
		  	1씩 증가하므로 -1 * i + 6 => 6-i 
		 */
		
		for(int i=5; i>0; i=i-1) {
			for(int j=0; j<i; j=j+1) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		/*
		  	1 *		1-1
		  	2 **		1-2
		  	3 ***		1-3
		  	4 **		1-2
		  	5 *		1-1
		  	3번째 줄 까지는 1개씩 늘어나고 
		  	4번째 줄 부터는 1개씩 줄어드는 구조
		         하나의 패턴이 아닌 경우에는 동일한 패턴이 적용되는
		         지점까지 분할을 해서 해결 
		 */
		
		for(int i=1; i<=5; i=i+1) {
			//증가하는 부분
			if(i<=3) {
				for(int j=1; j<=i; j=j+1) {
					System.out.print('*');
				}
			//감소하는 부분
			} else {
				for(int j=0; j<6-i; j=j+1) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		/*
		 	1     * 1-1
		 	2    ** 1-2
			3   *** 1-3
		 	4  **** 1-4
		 	5 ***** 1-5
		 	공백과 별 두개의 패턴
		 	공백은 줄어 들고 별은 늘어나는 구조
		 	공백 제어문과 별 제어문으로 구분
		 */
		for(int i=1; i<=5; i=i+1) {
			//공백부분
			for(int j=i; j<=4; j=j+1) {
				System.out.print(' ');
			}
			//별부분
			for(int k=1; k<=i; k=k+1) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		/*
		 	1 ***** 1-5
		 	2  **** 1-4
		 	3   *** 1-3
		 	4    ** 1-2
		 	5     * 1-1
		 	공백과 별 두개의 패턴
		 	공백은 늘어나고 들고 별은 줄어드는 구조
		 	공백 제어문과 별 제어문으로 구분
		 */
		
		for(int i=0; i<5; i=i+1) {
			//공백부분
			for(int j=0; j<i; j++) {
				System.out.print(' ');
			}
			//별부분
			for(int k=i; k<5; k=k+1) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		/*
		 	1   *** 1-3
		 	2    ** 1-2
		 	3     * 1-1
		 	4    ** 1-2
		 	5   *** 1-3
		 	1번째 줄부터 3번째 줄까지 줄어드는
		 	4번째 줄부터 5번째 줄까지 늘어나는 구조
		 	공백과 별 패턴, 지점 분할		
		 */
		
		for(int i=1; i<=5; i=i+1) {
			if(i<=3) {
				for(int j=1; j<=i+1; j=j+1) {
					System.out.print(' ');
				}
				for(int k=i; k<=3; k=k+1) {
					System.out.print('*');
				}
			} else {
				for(int j=i; j<=6; j=j+1) {
					System.out.print(' ');
				}
				for(int k=3; k<=i; k=k+1) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
	}
	
}
