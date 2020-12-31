package homeWork;

public class Player{
	private String id;
	private String pw;
	private int score;
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public int getScore() {return score;}
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	public void setScore(int score) {this.score = score;}
	public Player(String id) {
		this.id = id;
		this.score = 0;
	}
	public Player(String id, String pw) {
		this.id = id;
		this.pw = pw;
		this.score = 0;
	}
	void printPlayerInfo() {
		System.out.println("ID: "+id+"\nÁ¡¼ö : "+score+"Á¡");
	}
}