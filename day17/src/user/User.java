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
	//final�� Ŭ������ ��� �Ǵ���, �� �޼���� ������ ���� ����� ���Դϴ�.
	//public ���� �Ǿ� �ֱ� ������, �ڽ� Ŭ������ super.getId() ������ ������ ���ٰ����մϴ�.(Only Read)
	
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
