package scanEx;

//�� Ŭ����
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
		return bunho+"��\t"+name+"\t"+korScore+"��\t"+engScore+"��\t"+mathScore+"��\t"+getTotal()+"��\t"+getAvg()+"��";
	}
	
}