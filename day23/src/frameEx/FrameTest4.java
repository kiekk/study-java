package frameEx;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
/*
 	Frame
 */
public class FrameTest4 {

	public static void main(String[] args) {

		//�������� ������ "�׹�° ������"
		//MyFrame, MyEventListener �� �̿��ؼ� �������� �����غ��ϴ�.
		
		MyFrame mf = new MyFrame();
		mf.setTitle("�׹�° ������");
		mf.addWindowListener(new MyEventListener());
	}

}
