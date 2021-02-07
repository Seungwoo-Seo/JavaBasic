package javaBasic2_2;

import java.io.IOException;

public class ThrowsException {

	//main 메소드에서 호출할 수 있도록 static 메소드로 생성
	//이 메소드에서 발생하는 예외는 메소드를 호출하는 곳에서
	//처리해야 합니다.
	public static void method() throws Exception {
		int i = 10;
		int j = 0;
		System.out.printf("%d\n", i % j);
	}
	
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) { 
			e.printStackTrace();
		}

		//Runtime 인스턴스 생성
		Runtime rt = Runtime.getRuntime();
		//Runtime 의 exec 메소드는 예외처리를 강제합니다.
		//예외 처리 구문으로 감싸서 실행해야 합니다.
		try {
			//Mac에서는 아래처럼 작성
			//open /System/Applications/TextEdit.app
			rt.exec("notepad.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
