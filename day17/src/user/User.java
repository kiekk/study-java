package user;


public class User {
	private String id;
	private String pw;
	public User() {}
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	//final은 클래스가 상속 되더라도, 이 메서드는 재정의 하지 말라는 뜻입니다.
	//public 으로 되어 있기 때문에, 자식 클래스는 super.getId() 등으로 언제든 접근가능합니다.(Only Read)
	
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final String getPw() {
		return pw;
	}
	public final void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", pw=" + pw + "]";
	}

	
	
}
