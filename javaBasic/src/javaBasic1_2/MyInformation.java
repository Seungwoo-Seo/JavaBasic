package javaBasic1_2;

public class MyInformation {

	public static void main(String[] args) {
		
		//이름, 나이, 키, 몸무게, 성별, 결혼여부를
		//저장하고 출력하기
		//이름은 문자열, 나이는 정수, 키와 몸무게는 실수,
		//성별은 F 나 M 하나의 문자
		//결혼여부는 true 나 false로 저장
		
		//필요한 변수를 선언하고 값을 대입
		String name = "서승우";
		int age = 23;
		double height = 179.9;
		double weight = 67.8;
		char gender = 'M';
		boolean marriage = true;
		
		//출력하기 - 변수는 출력하는 함수에 대입하면
		//저장하고 있는 값을 출력해줍니다.
		//"" 과 변수를 + 로 연결하면 결합을 해줍니다.
		
//		System.out.println("나이는 " +  age);
//		System.out.println("키는 " +  height);
//		System.out.println("몸무게는 " +  weight);
//		System.out.println("성별은 " +  gender);
//		System.out.println("결혼여부는 " +  marriage);
		
		//\t는 탭이고 \n은 줄바꿈입니다.
		System.out.println("이름\t" + name + '\n' +
		"나이\t" + age + '\n' + 
		"키\t" + height);
		
	}

}
