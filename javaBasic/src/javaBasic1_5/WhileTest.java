package javaBasic1_5;

public class WhileTest {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		while(i<5) {
			System.out.println("Hello Java");
			i = i + 1;
		}
		
		int j = 1;
		while(j<4){
			System.out.println("image" + j);
			j = j + 1;
		}
		
		//image1.png, image3.png, image5.png 출력
		//3번 출력
		//공통된 부분 image .png
		//패턴을 갖는 부분은 1, 3, 5
		
		int k = 1;
		while(k<=3) {
			System.out.printf("image%d.png\n", 2 * k - 1);
			k = k + 1;
		}
		
		
	}

}
