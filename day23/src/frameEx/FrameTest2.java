package frameEx;

import java.awt.Color;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class FrameTest2 {

	public static void main(String[] args) {
		JFrame fr = new JFrame("�ι�° Swing JFrame");
		
		fr.setSize(400,400);
		fr.setLocation(500, 100);
//		fr.setBackground(Color.blue);	JFrame������ Color�� �ٸ� ������� �����մϴ�.
		//JFrame�� �����ʸ� ������� �ʰ� �ٷ� â�� ���� �� �ִ� �޼��� ����
		//fr.addWindowListener(new WindowListener() {});
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		
	}

}
