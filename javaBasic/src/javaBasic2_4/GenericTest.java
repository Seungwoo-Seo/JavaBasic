package javaBasic2_4;

class Generic<T> {
	private T[] data;	//숫자 자료형이나 boolean이 아닌 자료형은
						//null로 초기화
						//null은 대입된 인스턴스가 없다.
	
	//매개변수가 있는 생성자
	//데이터를 개수에 상관없이 대입 가능 : ...
	public Generic(T...n) {
		data = n;
	}
	
	public void disp() {
		for(T imsi : data) {
			System.out.print(imsi + "\t");
		}
		System.out.println();
	}
		
}			

//SOUTH, NORTH, WEST, EAST 만을 갖는 자료형을 생성
enum Direction{
	SOUTH, NORTH, WEST, EAST;
}

public class GenericTest {

	public static void main(String[] args) {
		Direction direction = Direction.EAST; 
		
		Generic<String> g1 = new Generic<String>("대한민국", "뉴질랜드");
		
		//인스턴스를 이용해서 disp 호출
		g1.disp();
		
		//정수를 출력하는 Generic을 생성
		Generic <Integer> g2 = new Generic<Integer>(87, 57, 89);
		
		//인스턴스를 이용해서 disp 호출
		g2.disp();
	}
	
}
