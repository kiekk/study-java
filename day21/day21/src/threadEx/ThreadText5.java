package threadEx;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 	���μ��� ���ο� �۾�����
 	�ּ��� �ϳ��� ���μ���(�������α׷�)�� �ϳ��� ������ �̻��� ������ �ֽ��ϴ�.

 	 ����ȭ (synchronized)
 	 - lock ���
 	 ��Ƽ������ -> �����ٷ��� �������� �����带 ���� ó���ϰ� �˴ϴ�.
 	 �� ��, ���������� �ϳ��� �����尡 ����Ǳ� ���� �ٸ� �������� ������
 	 �����ϴ� ������� "����ȭ"�� ���˴ϴ�.
 	   : �ٸ� �����尡 ���� �� �����ϴ�.
 	 �ݵ�� �ʿ��� ��쿡�� ����մϴ�.

 	 1. �޼��� ��ü������ ����ȭ�� �̴ϴ�,
 	 synchronized �޼���(){
 	 	//�Ӱ迵�� - �����尡 �����ϴ� �ڿ�(�ν��Ͻ���)
 	 }

 	 2. �޼��� ���ο��� ����ȭ�� �̴ϴ�.
 	 �޼���(){
 	 	synchronized(������ ��ü){
 	 		//�Ӱ迵�� - �����尡 �����ϴ� �ڿ�(�ν��Ͻ���)
 	 	}
 	 }
 */


//ATM ��.. ī��� ���� �����մϴ�.
//ATM ��.. ī�带 ���� �ִ� ���(��)�� �����ؼ�, ���� �����մϴ�.
//1. ATMŬ������ �����带 �����ؾ� �մϴ�.
//2. ���� ������ ��, �����ϴ� ������(���)�� ����ȭ�� �����ؾ��մϴ�.
//	 synchronized �� �ɾ��ݴϴ�.
// ��Ȳ, ���� ������1, �Ƶ� ������1
//		���ÿ� 1000���� �����մϴ�.(�� 5���� ����)
//		�����ڿ�(���±ݾ�)�� 10,000���� ��� �ֽ��ϴ�.
class ATM implements Runnable {
	private long depositMoney = 10000;	//�����ڿ�
	@Override
	public void run(){
//		synchronized (Thread.currentThread().getClass()) {
		synchronized (this) {
			//�Ӱ� ���� - �����尡 �����ؾ��� �ҽ��ڵ�
			for(int i = 0;i<5;i++) {
				withDraw(1000);	//1000���� �����մϴ�.
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}//end try
				if(depositMoney <= 0) break;
			}//end for(i)
		}
	}//end run
	private void withDraw(int money) {
		if(money > 0 ) {
			depositMoney -= money;
			System.out.println(Thread.currentThread().getName()+", �ܾ� ; "+depositMoney );
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}

}


public class ThreadText5 {
	public static void main(String[] args) {
		//ATM�⸦ �̿��ϴ� ������ 2 (����/�Ƶ�)
		//start()
		ATM atm = new ATM();
		Thread momCard = new Thread(atm,"����");
		Thread sonCard = new Thread(atm,"�Ƶ�");
		momCard.start();
		sonCard.start();
	}
}
