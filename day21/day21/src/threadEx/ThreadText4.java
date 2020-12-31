package threadEx;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	���μ��� ���ο� �۾�����
 	�ּ��� �ϳ��� ���μ���(�������α׷�)�� �ϳ��� ������ �̻��� ������ �ֽ��ϴ�.

 	Thread�� �̿��ؼ� ��ȭ�ϱ�! - ����ó��

 	�ܼ�â�� ��ȭâ
 	A : JOptionPane���� ��ȭ�� �Է��մϴ�.
 	B : Scanner�� �̿��ؼ� �ܼ�â���� �Է��մϴ�.

 */
class Host extends Thread {
	public Host(String name) {
		super(name);
	}

	@Override
	public void run() {
		String idA = "";
		System.out.println(this.getName()+"���� �α��� �Ͽ����ϴ�.");
		while(true) {
			Scanner sc = new Scanner(System.in);
			idA = sc.nextLine();
			if(idA.equalsIgnoreCase("q")) break;
			System.out.println(this.getName()+" : "+idA);
		}
		System.out.println(this.getName()+"���� ��ȭâ�� �����̽��ϴ�.");
	}//end run
}//end Host
class Guest extends Thread {
	public Guest(String name) {
		super(name);
	}
	@Override
	public void run() {
		String idB = "";
		System.out.println(this.getName()+"���� �α��� �Ͽ����ϴ�.");
		while(true){
			JOptionPane jop = new JOptionPane();
			idB = jop.showInputDialog(this.getName()+"�� ��ȭ");
			if(idB.equalsIgnoreCase("q")) break;
			System.out.println(this.getName()+ " : "+idB);
		}
		System.out.println(this.getName()+"���� ��ȭâ�� �����̽��ϴ�.");
	}//end run
}//end Guest
public class ThreadText4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id1 = "";
		String id2 = "";
		System.out.println("Host�� ID�� �Է��� �ּ���"); id1 = sc.next(); 
		System.out.println("Guest�� ID�� �Է��� �ּ���"); id2 = sc.next();
		new Host(id1).start();
		new Guest(id2).start();
		
	}
}
