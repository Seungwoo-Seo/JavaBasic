package javaBasic2_2;

public class ExceptionFlow {

	public static void main(String[] args) {
		
		int [] arr = {20, 30, 10, 50};
		
		try {
			System.out.printf("[0]:%d\n", arr[0]);
			System.out.printf("[4]:%d\n", arr[4]);
		} catch(Exception e) {
			//예외 내용을 출력
			System.out.printf("예외 내용 : %s\n", e.getMessage());
			//예외 발생 지점을 역추적
			e.printStackTrace();
		} finally {
			System.out.println("무조건 수행");
			arr[0] = 30;
		}
		System.out.println(arr[0]);
	}
	
}
