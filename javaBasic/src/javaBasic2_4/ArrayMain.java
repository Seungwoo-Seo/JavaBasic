package javaBasic2_4;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		//Member 데이터 5개를 저장할 수 있는 공간을 생성
		//5개의 공간 각각에는 현재는 null이 저장되어 있습니다.
		Member[] members = new Member[5];
		
		Member member = new Member();
		member.setNum(1);
		member.setName("가나다");
		member.setGender("남자");
		member.setScore(84); 
		member.setAge(22);
		
		members[0] = member; 
		
		member = new Member();
		
		member.setNum(2);
		member.setName("라마바");
	 	member.setGender("여자");
		member.setScore(48);
		member.setAge(25);
		
		members[1] = member; 
		
		member = new Member();
		
		member.setNum(3);
		member.setName("바마라");
	 	member.setGender("남자");
		member.setScore(75);
		member.setAge(23);
		
		members[2] = member; 
		
		member = new Member();
		
		member.setNum(4);
		member.setName("다나가");
	 	member.setGender("여자");
		member.setScore(95);
		member.setAge(20);
		
		members[3] = member; 
		
		member = new Member();
		
		member.setNum(5);
		member.setName("사아자");
	 	member.setGender("여자");
		member.setScore(62);
		member.setAge(21);
		
		members[4] = member; 
		
		//모든 데이터 출력
		for(Member m : members) {
			System.out.printf("%s\n", m);
		}
		
		//데이터 정렬
		Arrays.sort(members);
		System.out.printf("=====정렬 후=====\n");
		
		//모든 데이터 출력
		for(Member m : members) {
			System.out.printf("%s\n", m);
		}
		

	}

}
