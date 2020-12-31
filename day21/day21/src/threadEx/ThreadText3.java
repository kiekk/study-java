package threadEx;
/*
 	���μ��� ���ο� �۾�����
 	�ּ��� �ϳ��� ���μ���(�������α׷�)�� �ϳ��� ������ �̻��� ������ �ֽ��ϴ�.
 	
 	join()
 	- join() ȣ���� �����尡 ������ ������, �����ϴ� �����带 �ߴ��ϰ� �˴ϴ�.
 	
 	
 */
class MyThreadJoin implements Runnable{
	@Override
	public void run() {
		System.out.println("run �޼��� ����");
		first();
	}
	private void first() {
		System.out.println("first�޼��� ����");
		second();
	}
	private void second() {
		System.out.println("second�޼��� ����");
	}
}

public class ThreadText3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" : main�� ���۵Ǿ����ϴ�.");
		
		//join��ų ��ü ����
		Runnable r =new MyThreadJoin();
		Thread th = new Thread(r);
		//th��ü�� main �����带 �����ϱ� ���� join�� �˴ϴ�.
		th.start();
		//���� �����带 �����Ű�� �ʰ� pause ��Ű�� �˴ϴ�.
	
		System.out.println(Thread.currentThread().getName()+" : main�� ����Ǿ����ϴ�.");
		try {
			//join()�� ��� ��ģ �Ŀ�, ���� Thread�� ����� �մϴ�.
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
