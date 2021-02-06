package javaBasic1_9;

public class UserMain {

	public static void main(String[] args) {
		//인스턴스 생성
		//프로그램 내에서 인스턴스를 1개만 만드는 경우
		//인스턴스 이름을 클래스 이름으로 하는데 첫글자를 소문자로 변경
		//User()는 생성자를 호출하는 것입니다.
		User user = new User();
		
		user.setNum(1);
		user.setId("Seo");
		user.setPw("woo");
		user.setName("서승우");
		user.setNickname("s");
		
		User user2 = new User(2, "abcd", "efg", "zz", "kk");
		System.out.println(user2);
		
		//속성의 값을 가져올 때는 get 메소드를 이용
		System.out.printf("%s\n", user.getId());
		//전체를 확인 - toString을 호출해서 출력
		System.out.println(user);
		
		
		
		//3개의 User 인스턴스를 저장할 배열을 생성
		User[] users = new User[3];
		
		users[0] = new User(1, "abc", "123", "아담", "서");
		users[1] = new User(2, "def", "456", "이브", "승");
		
		User user3 = new User();
		user3.setNum(3);
		user3.setId("ghi");
		user3.setPw("789");
		user3.setNickname("아브");
		user3.setName("우");
		users[2] = user3;
		
		
		//users의 모든 데이터에 접근해서 출력
		for(User temp : users) {
			System.out.println(temp);
			
		}
		
		
		
		
		
	}

}
