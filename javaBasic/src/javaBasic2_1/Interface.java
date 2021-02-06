package javaBasic2_1;

interface MyInterface {
	 
	public int n = 10;		//원형 : public final int n = 10;	
	//인터페이스 안에 변수를 선언하면 무조건 final
	
	//인터페이스 안에 메소드를 생성하면 무조건 abstract
	public void method();	//원형 : public abstract void method();
	
	//인터페이스 안에 메소드를 생성하고 내용을 작성할려면
	//접근 지정자를 default로 명시해야 합니다.
	default void method1() {
		System.out.println("디폴트 메소드");
	}
}

//MyInterface 구현하는 클래스
class MyInterfaceImpl implements MyInterface {

	@Override
	public void method() {
		System.out.println("인터페이스의 메소드 구현");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		//인터페이스는 new를 이용해서 객체 생성을 못함
		//MyInterface obj = new MyInterface();
			
		MyInterface obj = new MyInterfaceImpl();
		obj.method();
	}
}
