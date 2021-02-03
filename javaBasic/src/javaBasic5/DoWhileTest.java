package javaBasic5;

public class DoWhileTest {

	public static void main(String[] args) {
		
		int i=1;
		int sum = 0;
		
		do{
			sum = sum + i;
			i=i+1;
		}while(i<=100);
		System.out.println("sum : " + sum);
		
		int j = 1;
		int total = 0;
		
		do {
			if(j % 2 != 0) {
				total = total + j;
			}
			j = j + 1;
		} while(j<=100);
		System.out.println("total : " + total);
		
	}
	
}
