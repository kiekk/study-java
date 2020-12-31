package threadEx;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
/*
 	GUI �� �ð��� ����غ��ϴ�.
 	   java.awt ��Ű��		javax.swing ��Ű��
 	- Frame					- JFrame		������ â ���� �� ���� Ŭ����
 	- Label					- JLabel		�ؽ�Ʈ �Է��� �� ���� ����մϴ�.
 	- Font					- Font			���� ũ��, ������ ������ �� ����մϴ�.
 */
class DigitalClock extends JFrame implements Runnable {
	private Thread thread;
	private JLabel lbl;
	public DigitalClock(){
		super("������ �ð�");
		lbl = new JLabel();		//������ ǥ���� �� �ִ� Label��ü ����
		lbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
		lbl.setHorizontalAlignment(JLabel.CENTER);
		
		if(thread == null) {
			thread = new Thread(this);	//DigitalClock�� start ��Ű�� ���� ��
			thread.start();
		}

		this.add(lbl);

		//������ ��ġ(��ǥ), ũ��(���μ���)
		this.setBounds(200, 100, 350, 100);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void run() {
		//StringBuffer�� �ν��Ͻ��� �ѹ��� ������ �ڿ� �� ������ �ν��Ͻ��� ������ �۾��� �մϴ�.
		//�޸�����
		StringBuffer now;
		while(true) {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date(cal.getTimeInMillis());
			now = new StringBuffer(sdf.format(date));
			lbl.setText(now.toString());
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
public class ThreadText6_1 {
	public static void main(String[] args) {
		new DigitalClock();		//�������� ���� -> Label�� ���ؼ� �ð��� �귯���ϴ�.

	}
}
