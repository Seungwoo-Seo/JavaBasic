package javaBasic1_7;

public class User {
	//프로퍼티
	//public 이면 클래스 내부의 메소드에서 사용이 가능하고
	//클래스 외부에서 인스턴스를 이용해서도 접근 가능
	public int num;
	//클래스 내부의 메소드에서만 사용이 가능
	private String name;
	
	//메소드
	public void disp() {
		System.out.println(name);
		System.out.printf("메소드\n");
	}
		
}
