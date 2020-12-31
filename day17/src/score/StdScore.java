package score;
class Person {
	private String name;
	private String id;
	private String pw;

	//getter setter
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	//생성자
	public Person(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return name +"\n"+id+"\n"+pw+"\n";
	}
}//end Person
public class StdScore extends Person{
	private int stdNum = 2006001;	//초기값 설정
	private int kor;
	private int eng;
	private int math;
	private String msg;
	//getter setter
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public String getMsg() {return msg;}
	public void setMsg(String msg) {this.msg = msg;}
	public int getStdNum() {return stdNum;}
	public void setStdNum(int stdNum) {this.stdNum = stdNum;}
	//생성자
	public StdScore(String id, String pw, String name,int kor, int eng, int math) {
		super(id, pw, name);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public StdScore(String name, String id, String pw) {
		super(name, id, pw);
		this.kor = -1;
		this.eng = -1;
		this.math = -1;
		this.msg = "";
	}
	public StdScore() {
		super("","","");
	}
	@Override
	public String toString() {
		return kor+"\n"+eng+"\n"+math;
	}
}
