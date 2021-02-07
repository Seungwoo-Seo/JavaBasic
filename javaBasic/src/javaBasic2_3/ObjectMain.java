package javaBasic2_3;

public class ObjectMain {

	public static void main(String[] args) {
		//User 클래스를 인스턴스를 생성하고 데이터를 설정
		User user1 = new User();
		user1.setNum(1);
		user1.setName("제니");
				
		//번호 와 이름을 확인 - 출력
		System.out.printf("번호:%d 이름:%s\n", user1.getNum(), user1.getName());
				
		//toString은 호출하는 메소드에 인스턴스 이름만 대입하면 호출
		System.out.println(user1);
		System.out.printf("%s\n",  user1.toString());

		//새로운 User 인스턴스 생성
		User user2 = new User();
		user2.setNum(1);
		user2.setName("제니");
				
		//==로 인스턴스 비교 : 동일한 인스턴스를 참조하는지 비교
		//user1 과 user2는 각각 new를 호출했으므로 false 리턴
		System.out.printf("==:%b\n", user1 == user2);
		System.out.printf("equals:%b\n", user1.equals(user2));
				
		//새로운 인스턴스 생성
		User user3 = new User();
		user3.setNum(3);
		user3.setName("지수");
				
		//user3의 참조를 user4에 대입
		User user4 = user3;
		//user4가 name을 변경
		user4.setName("로제");
		//user3 과 user4가 동일한 인스턴스를 참조하기 때문에
		//user4가 name을 변경하면 user3에게도 동일한 효과 적용
		System.out.printf("%s\n", user3);
		System.out.printf("%s\n", user4);
				
		//user3의 내용을 복제를 해서 새로운 인스턴스를 user5에 대입
		User user5 = user3.clone();
		//user5의 내용을 변경해도 user3의 내용은 변경되지 않음
		user5.setName("리사");
		System.out.printf("%s\n", user3);
		System.out.printf("%s\n", user5);
	
	}

}
