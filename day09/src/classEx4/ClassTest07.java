package classEx4;
/*
 	this() : this 생성자

	 	성적은 0~100점만 들어올 수 있습니다.
	 	어떤 사람은 한과목도 안볼 수 있고,
	 	어떤 사람은 한과목만 볼수도 있는 상황입니다.
	 	(단, 이름은 반드시 존재합니다.)
	 	생성자 개수는 이름만, 이름+국어,이름+국어+영어,이름+국어+영어+수학
	 	이때, 각 과목별로 0~100점 사이 제어를 해야합니다.
	 	생성자는 this()를 이용해서 재활용할 수 있도록 합니다.
 */
class Score{
	String name;
	int kor;
	int eng;
	int math;
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Score(String name, int kor, int eng) {
		this(name,kor,eng,0);
	}
	
	public Score(String name, int kor) {
		this(name,kor,0,0);
	}
	public Score(String name) {
		this(name,0,0,0);
	}
	
	//출력용만 만들기 (get/set생략)
	void printScore() { 
		System.out.println("이름 : "+name+"  국어 : "+kor+"점 영어 : "+eng+"점 수학 : "+math+"점");
	}
}

public class ClassTest07 {

	public static void main(String[] args) {
		//객체 3개 만든 후
		//각 객체는 초기값이 모두 다릅니다.
		Score hgd = new Score("홍길동",10,20,50);
		Score iss = new Score("이순신",20,50); 
		Score pms = new Score("박문수",30);
		
		hgd.printScore();
		iss.printScore();
		pms.printScore();
		
	}

}
