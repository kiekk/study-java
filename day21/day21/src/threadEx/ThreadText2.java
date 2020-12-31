package threadEx;
/*
 	���μ��� ���ο� �۾�����
 	�ּ��� �ϳ��� ���μ���(�������α׷�)�� �ϳ��� ������ �̻��� ������ �ֽ��ϴ�.
 	
 	����ó��
 	- �� �۾�(�޼���, �Ǵ� ��ü) �� ���ÿ� ����� �� �ְ� �մϴ�.
 */
class ThreadEx1 extends Thread{
	public ThreadEx1(String name) {
		super(name);
	}
	@Override
	public void run() {
		//������ �̸��� ���� ��, �����ڸ� ���ؼ� super���� �̸��� �˷��ݴϴ�.
		System.out.println(this.getName());
		
		//������� �⺻������ �̸��� ���� ������, ������������ ���ڸ� �ο��ؼ� ��ü������ �����մϴ�. Thread-0
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadText2 {
	public static void main(String[] args) {
		ThreadEx1 th = new ThreadEx1("������-1");
		th.start();
		
	}
}
