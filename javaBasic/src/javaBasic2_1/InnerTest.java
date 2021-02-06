package javaBasic2_1;

class Outer{
	
	static {
		System.out.println("Outer 클래스 호출");
	}
	
	//일반 내부 클래스 생성
	class Inner{
		{
			System.out.println("Inner 클래스 호출");
		}
	}
	//내부에서 Inner 클래스 사용
	Inner inner = new Inner();
	
	
	//Inner Class에 static 멤버가 있을 때는
	//class 앞에 static을 추가해 주어야 합니다.
	static class StaticInner {
		static int member = 10;
	}
	
	//LocalInner	: 메소드 안에서 만들어진 클래스
	//메소드 안에서만 사용이 가능
	public void method() {
		class LocalInner{
			{
				System.out.println("LoaclInner 호출");
			}
		}
		LocalInner localInner = new LocalInner();
	}
	//LocalInner 는 메소드 외부에서 사용 못함
	//LocalInner localInner = new LocalInner(); //에러
}

public class InnerTest {

	public static void main(String[] args) {
		//일반 Inner 클래스는 외부에서는 외부 클래스의
		//인스턴스를 생성해서 사용
		//Inner inner = new Inner();	//에러
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(); 
	
		outer.method();
		
		//static inner 클래스는 외부 클래스의 인스턴스 없이 사용
		System.out.println(Outer.StaticInner.member);
	}
	
}
