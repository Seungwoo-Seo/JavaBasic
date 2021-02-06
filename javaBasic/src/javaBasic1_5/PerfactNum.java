package javaBasic1_5;

public class PerfactNum {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		for(int i=2; i<=1000; i=i+1) {
			sum = 0;
			for(int j=1; j<=i; j=j+1) {			//for(int j=1; j<=i/2; j=j+1) 약수는 자기의 절반을
				if(i % j == 0) {				//넘을 수 없다 그렇기 때문에 절반까지만 약수를 구하면 됨
					sum = sum + j;
				}
			}
			if(sum - i == i) {					//if(sum == i) 위에로 했을 시 더 효율이 좋은 공식이 나온다
				System.out.println(i);			//디버깅 = 값을 확인해 보는 것
				
				count = count + 1;
			}
		}
		System.out.println("완전수 : " + count);

	}

}
