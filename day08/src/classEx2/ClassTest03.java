package classEx2;

class Score {
	private int num;
	private int kor;
	private int eng;
	private int math;

	//setter 메서드 만들기
	public void setNum(int num){this.num = num;}//end setNum
	public void setKor(int kor){this.kor = kor;}//end setkor
	public void setEng(int eng){this.eng = eng;}//end setEng
	public void setMath(int math){this.math = math;}//end setMath
	//getter 메서드 만들기
	public int getNum(){return num;}//end getNum
	public int getKor(){return kor;}//end getKor
	public int getEng(){return eng;}//end getEng
	public int getMath(){return math;}//end getMath
	//총점 구하기 메소드
	private int getSum() {			//해당 알고리즘을 비공개로 처리
									//다른 메소드에 종속적인 메소드는 굳이 public으로 공개할 필요는 없습니다. private로 비공개 처리
		return this.kor+this.eng+this.math;
	}//end getSum
	//평균 구하기 메소드
	private double getAvg() {
		return (this.kor+this.eng+this.math) / 3.0;
	}//end getAvg
	//string.format을 이용한 방법
//	private String getAvg2() {
//		return String.format("%.1f", getSum() / 3.0);
//	}
	//출력용 메서드를 만들어 봅니다.
	void printScore() {
		System.out.println("번호 : "+this.num+"번 국어 : "+this.kor+"점 영어 : "+this.eng+"점 수학 : "+this.math+"점");
		System.out.printf("총점 : %d점   평균 : %.1f점\n",getSum(), getAvg());		//double로 getAvg를 구한 경우
//		System.out.println("총점 : "+getSum()+"점   평균 : " + getAvg2()+"점");  //string.format을 이용해 getAvg2를 구한 경우
		
	}//end printScore
}//end Score

public class ClassTest03 {

	public static void main(String[] args) {
		Score hgd = new Score();
		hgd.setNum(1);
		hgd.setKor(90);
		hgd.setEng(20);
		hgd.setMath(50);
		hgd.printScore();
		
		//hgd의 특정 부분만 출력하고 싶은 경우
		//getter메소드 이용
		
		System.out.println("홍길동의 번호 : "+hgd.getNum()+ "번 국어 점수 : "+hgd.getKor()+"점 영어 점수 : "+hgd.getEng()+"점 "
				+ "수학 점수 : "+hgd.getMath()+"점");
	}//end main
}//end class
