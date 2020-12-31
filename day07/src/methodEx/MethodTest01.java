package methodEx;

class A{
	//인스턴스
	
	//메서드
}
//class 외부에 메서드를 선언할 수 없습니다.
public class MethodTest01 {
	//필드 (인스턴스 변수) 영역
	int kor, eng, mat;
	//메서드 영역
	//1)메서드 분류
	//		일반 메서드(비즈니스 메서드)
	//		getter/setter
	//		생성자
	//		추상메서드
	//2)비즈니스 메서드
//	void printScore(int mK,int mE,int mM) {
		void printScore() {
		//this 라는 변수를 메소드 내부에 내장하고 있습니다.
		//이 this 는 객체에 대응하는 참조변수입니다.
		//눈에 보이지는않지만 ,상주하고 있기 때문에
		//언제든 명시적으로 사용할 수 있습니다.
		//이 this는 항상 상주하고 있기 때문에 생략합니다.
		//this는 객체를 대신합니다.
		//그래서 객체가 사용할 수 있는 인스턴스 변수와 연결됩니다.
		//mK = this.kor mE = this.eng mM = this.mat와 동일합니다.
		//this를 사용할 경우 매개변수를 작성하지 않아도 됩니다.
		System.out.printf("국어 : %d점\t영어 : %d점\t수학 : %d점\t",this.kor,this.eng,this.mat);
//		System.out.printf("\n국어 : %d점\t영어 : %d점\t수학 : %d점\t\n",mK,mE,mM);
	}//end printScore
	void printScoreAr(int [] arScore){
		System.out.println();
		String []subName = {"국어","영어","수학"};
		for(int i = 0;i<arScore.length;i++) {
			System.out.println(subName[i]+" 점수 : "+arScore[i]+"점");
		}//end for(i)
	}//end printScoreAr
	public static void main(String[] args) {
		//홍길동의 국어 = 10,영어 = 20,수학 = 30
		//printScore(국,영,수) 출력해봅니다.
		MethodTest01 hgd = new MethodTest01();
		hgd.kor = 10;
		hgd.eng = 20;
		hgd.mat = 30;
		System.out.println("-----홍길동님 점수-----");
		hgd.printScore();
		//int []arScore = {홍길동 점수};
		//printScoreAr(arScore) 출력해봅니다.
		//배열은 class에 속해 있지 않기 때문에 printScore와 달리 직접 매개변수를 전달해 줘야 합니다.
		int []arScore = {hgd.kor,hgd.eng,hgd.mat};
		hgd.printScoreAr(arScore);
		
		//이순신의 점수
		MethodTest01 iss = new MethodTest01();
		iss.kor = 11;
		iss.eng = 22;
		iss.mat = 33;
		System.out.println();
		System.out.println("-----이순신님 점수-----");
		iss.printScore();
		int []arScore2 = {iss.kor,iss.eng,iss.mat};
		iss.printScoreAr(arScore2);
	}//end main
}//end class
