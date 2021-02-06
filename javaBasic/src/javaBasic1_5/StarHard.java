package javaBasic1_5;

public class StarHard {

	public static void main(String[] args) {
		
		/*
		 	----*----	1	5		|부분1
			---*-*---	2	4,6		|부분2
			--*---*--	3	3,7
			-*-----*-	4	2,8
		 	*********	5			|부분3
		 	
		 	알고리즘 순서
		 	1. 5번째 줄과 나머지 줄이 다른 패턴으로 보임 구분해야될듯 (큰 구조 if~else)
		 	2. 한 줄에 9번 반복 (순회 for)
		 	3. 변수와 논리연산자를 이용해서 위치를 잡고 값 설정 
		 	4. 나머지 값들은 공백 
		 	
		 	조건 너무 많음
		 */
		
		for(int i=1; i<=5; i=i+1) {
			if(i<=4) {
				for(int j=1; j<=9; j=j+1) {
					if(j == 5 && i == 1) {
						System.out.print('*');
					} else if(j == 4 && i == 2 || j == 6 && i == 2) {
						System.out.print('*');
					} else if(j == 3 && i == 3 || j == 7 && i == 3) {
						System.out.print('*');
					} else if(j == 2 && i == 4 || j == 8 && i == 4) {
						System.out.print('*');	
					} else {
						System.out.print(' ');
					}
				}
			} else {
				for(int j=1; j<=9; j=j+1) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		System.out.println("================================");
		
		/*
		 	----1----		
			---2-3---
			--4---5--
			-7-----8-
			901234567
			
			위의 예제에서 변형
			switch로 하면 코딩이 너무 지저분하게 보임..
			질문) 지금도 좀 지저분해 보이는데 이게 최선일까?
			질문) " " 말고 ' '이게 맞는거 아닌가
			
			변수 지정
		 */
		
		for(int i=1; i<=5; i=i+1) {
			if(i<=4) {
				for(int j=1; j<=9; j=j+1) {
					if(j == 5 && i == 1) System.out.print('1');
					else if(j == 4 && i == 2) System.out.print('2');
					else if(j == 6 && i == 2) System.out.print('3');
					else if(j == 3 && i == 3) System.out.print('4');
					else if(j == 7 && i == 3) System.out.print('5');
					else if(j == 2 && i == 4) System.out.print('7');
					else if(j == 8 && i == 4) System.out.print('8');
					else System.out.print(' ');
				}
			} else {
				System.out.print("901234567");
			}
			System.out.println();
		}
		
		
		
		
	} //main
	
} //class
