package starPrintEx;
/*
 	�׷��� ���� ������Ʈ
 */

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class PaintFrame extends Frame{
	int speed = 1;
	Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 0,5,0,50);
	Label lblSpeed = new Label("Speed : 1");
	
	public PaintFrame(String title) {
		super(title);
		lblSpeed.setBackground(Color.YELLOW);
		lblSpeed.setBounds(10, 30, 65, 15);
		
		//scroll �ٰ� �� ��ġ�� ũ�� ����
		sb.setBounds(20,250,260,20);
		
		add(sb);
		add(lblSpeed);
		
		//��ũ�ѹٿ� �̺�Ʈ �ɱ�
		//���� �ٲ𶧸��� �߰��ϴ� ������
		sb.addAdjustmentListener(new MyHandler());
		addWindowListener(new MyHandler());
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	
	//���� Ŭ������.. �̺�Ʈ�� �ٷ�� �ڵ鷯�� ����ϴ�.
	class MyHandler extends WindowAdapter implements AdjustmentListener {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		//��ũ�ѹ��� ���� �����̶� ����Ǹ� ������ ȣ��Ǵ� �޼����Դϴ�.
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sb.getValue();
			lblSpeed.setText("Speed : "+speed);
		}
		
	}
}
public class PaintFrameTest {

	public static void main(String[] args) {
		PaintFrame p = new PaintFrame("��ũ�ѹٸ� �̿��� ������ ����");
		
		Graphics g = p.getGraphics();		//p�� �������� ������ �ֽ��ϴ�. �� �����ӿ��� �׷��� ���޼��带 ��������� ȣ��. returnŸ���� Graphics
		
		g.setColor(Color.RED);
		for(int i = 0; true;i+=p.speed) {   //i�� ������ p�� �ִ� speed���� �ݿ��մϴ�.
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			//������ ��ǥ�� �̵��ؼ� ���� ���־� �մϴ�.
			g.clearRect(0, 0, 300, 300);	//�������� ������ refresh�ؾ� �̵��ϴ� �� ó�� ���̰� �˴ϴ�.
			//g�� �׸��� �׸��ϴ�.
			g.drawString("Hello", i, 150);
			//i���� ���� ���� �ٴٸ���.. �ٽ� 0���� ���۵˴ϴ�.
			i = (i<300?i:0);
		}
		

	}

}
