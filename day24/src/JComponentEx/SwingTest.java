package JComponentEx;

import javax.swing.JFrame;

/*
 	swing�� awt �ļ� GUI ��Ű���Դϴ�.
 	awt���� �淮ȭ �Ǿ��ֽ��ϴ�. (�ҽ�, ����ӵ�, ���Ǽ��� ������)
 	���������Ͽ� ���� ��ȭ�� �ֽ��ϴ�.(���� �������̺�Ʈ, ��Ʈ �� �鵵�� �� ��Ű���� �״�� awt�� ����մϴ�.)
 */
public class SwingTest extends JFrame{
	public SwingTest() {
		super("���� ����");
		setLocation(100, 100);
		setSize(500, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//dispose�� exit�� ����
		//dispose�� ���� �ɷ��ִ� ������Ʈ�� �޸𸮿��� ���ִ� ���Դϴ�.
		//exit�� �������� GUI���α׷� ��ü�� �޸𸮿��� ���ִ� ���Դϴ�.
	}
	public static void main(String[] args) {
		

	}

}
