package javaBasic2_1;

//class 앞에 abstract가 있으면 상속받는 클래스를 생성해서 사용
//class 앞에 final이 있으면 상속할 수 없습니다.
final class Test{
	//메소드 앞에 final을 추가하면 overriding 할 수 없음
	public void method() {
		System.out.printf("메소드1\n");
	}
}

//Test class가 final 이기 때문에 상속 불가
//class TestEx extends Test {	
//	@Override
//	public void method() {
//		super.method();
//		System.out.println("기능 추가");
//	}
//}

public class Final {

	public static void main(String[] args) {
		int n = 10;
		System.out.printf("n:%d\n", n);
		n = 20;
		System.out.printf("n:%d\n", n);
		
		final String NAME = "ADAM";
		System.out.printf("name:%s\n", NAME);
		//NAME = "ITGGANGPAE"; 
		//final 변수의 값은 변경할 수 없음
		
		//Test 클래스의 method를 호출
		//Test test = new TestEx();
		//test.method(); 
		
	}

}
