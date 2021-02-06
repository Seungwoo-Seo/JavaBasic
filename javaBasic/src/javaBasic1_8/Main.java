package javaBasic1_8;

public class Main {

	public static void main(String[] args) {
		
		//ToDo 인스턴스 생성
		ToDo td1 = new ToDo();
		td1.num = 1;
		td1.date = "2020-10-15";
		td1.content = "서점 가기";
		
		ToDo td2 = new ToDo();
		td2.num = 2;
		td2.date = "2020-10-16";
		td2.content = "종각 7시";
		
		//static 변수에 데이터 저장하기
		ToDo.nickname = "adam";
		
		System.out.printf("%10s%5d%15s%10s\n", ToDo.nickname, td1.num,
				td1.date, td1.content);
		System.out.printf("%10s%5d%15s%10s\n", ToDo.nickname, td2.num,
				td2.date, td2.content);
		
		
	}

}
