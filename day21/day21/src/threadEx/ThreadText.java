package threadEx;
/*
 	���μ��� ���ο� �۾�����
 	�ּ��� �ϳ��� ���μ���(�������α׷�)�� �ϳ��� ������ �̻��� ������ �ֽ��ϴ�.
 	
 	����ó��
 	- �� �۾�(�޼���, �Ǵ� ��ü) �� ���ÿ� ����� �� �ְ� �մϴ�.
 */
class Plus extends Thread{
	public Plus(String name) {
		super(name);
	}

	public void run() {
		for(int i = 0;i<10;i++) {
			try {
				System.out.println("+"+getName());
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	};
}
class Minus implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			try {
										//Runnable�� ��� currnetThread()�޼��带 �̿��ؼ� getName()�� �����մϴ�.
				System.out.println("-"+Thread.currentThread().getName());
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
}
public class ThreadText {
	public static void main(String[] args) {
		//+,-�� ���ÿ� ����ɼ� �ְ� ����� ���� ��ǥ - ����ó��
		Plus plus = new Plus("�÷���");
		plus.start();	//start()�� ���ؼ� �۾������ڿ� "���" �ǰ�, �۾�������(�����ٷ�)�� run �޼��带 ã�� run �޼��� ������ �۾��� �����ϰ� �˴ϴ�.
		Thread minus = new Thread(new Minus(),"���̳ʽ�");	//���̳ʽ��� Runnable�̹Ƿ� �����ڸ� ���� Thread�� name�� ������ �� �����ϴ�.
		minus.start();
		
	}
}
