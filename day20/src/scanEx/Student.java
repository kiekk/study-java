package scanEx;

//모델 클래스
public class Student {
	int bunho;
	String name;
	int korScore;
	int engScore;
	int mathScore;
	public Student(int bun, String stdName, int kS, int eS, int mS) {
		bunho = bun;
		name = stdName;
		korScore = kS;
		engScore = eS;
		mathScore = mS;
	}
	int getTotal() {
		return korScore + engScore + mathScore;
	}
	String getAvg() {
		return String.format("%.1f", getTotal()/(double)3);
	}
	@Override
	public String toString() {
		return bunho+"번\t"+name+"\t"+korScore+"점\t"+engScore+"점\t"+mathScore+"점\t"+getTotal()+"점\t"+getAvg()+"점";
	}
	
}