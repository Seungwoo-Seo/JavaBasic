package javaBasic2_4;

public class Member implements Comparable<Member> {

	private int num;
	private String name;
	private String gender;
	private int score;
	private int age;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ClassPractice [num=" + num + ", name=" + name + ", gender=" + gender + ", score=" + score + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Member arg0) {
//		오름차순
//		if(this.score > arg0.score) {
//			return 1;
//		} else if(this.score == arg0.score) {
//			return 0;
//		} else {
//			return -1;
//		}
		
//		내림차순
//		if(this.score < arg0.score) {
//			return 1;
//		} else if(this.score == arg0.score) {
//			return 0;
//		} else {
//			return -1;
//		}
		
//		return this.score - arg0.score;
		
		//이름을 가지고 크기 비교
		//이름은 문자열이라서 뺄셈이 안됩니다.
		//문자열은 이미 Comparable 인터페이스를 implements
		//compareTo 메소드가 존재합니다.
		
//		return this.name.compareTo(arg0.name);
		
		//이름의 내림차순 정렬
		return arg0.name.compareTo(this.name);
		
	}
	
	
	
}
