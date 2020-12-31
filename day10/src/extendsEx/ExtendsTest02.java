package extendsEx;
/*
	상속
	private 멤버와 super 생성자
	1. 자식 타입으로 초기값이 있는 생성자를 만들었습니다.
	2. 자식 생성자(매개변수 4개짜리)에서는 초기값 4개를 인스턴스 변수에 초기화 해줘야 합니다.
	3. 이때, 앞선 3개 인자는 부모생성자에게 다시 전달해야 합니다.
	4. 그리고 자신이 갖고 있는 변수에게만 초기화를 진행하면 됩니다.
	5. printScore는 부모가 갖고 있는 메서드인데.. 부모는 자식이 art를 갖고 있는지 모릅니다.
	어떻게 해야 이름, 국어, 영어, 수학, 미술까지 출력할 수 있을지 고민해봅니다.
 */
class Score{
	private String name;
	private int kor;
	private int eng;
	public Score(String name,int kor,int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public String getName() {return name;}
	public int getKor() {return kor;}
	public int getEng() {return eng;}
	public void printScore() {
		System.out.print(name +" "+kor+" "+eng);
	}
}
class SchoolArt extends Score{
	private int art;
	
	public SchoolArt(String name,int kor,int eng,int art) {
		super(name,kor,eng);
		this.art = art;
	}
	//오버라이드
	//1. 부모 메서드의 내용(블럭안에 있는 내용{})이 맘에 안들때,
	//2. 자식클래스에서는 부모의 메서드 선언부와 똑같이 작성한 후,
	//3. 메서드 내부에 쓰고 싶은 소스를 다시 작성하면 됩니다.
	//	이것을 오버라이드 == 재정의 == 다시 작성 이라고 합니다.
	//4. 상속관계에서만 발동됩니다. override(무시하다,기각하다)
	//	-부모 메서드는 자식이 똑같이 작성하는 바람에, 호출에서 무시당하게 됩니다.
	
	//
	
	public void printScore() {
		super.printScore();
		System.out.println(" 미술 : "+art+"점");
//		System.out.println("이름 : "+getName()+" 국어 : "+getKor()+"점 영어 : "+getEng()+"점 미술 : "+art+"점");
	}
}
public class ExtendsTest02 {

	public static void main(String[] args) {
		SchoolArt hgd = new SchoolArt("홍길동",100,100,100);
		hgd.printScore();
	}//end main
}//end class ExtendsTest01