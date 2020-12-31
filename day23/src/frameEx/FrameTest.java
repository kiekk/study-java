package frameEx;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;

public class FrameTest {

	public static void main(String[] args) {
		Frame fr = new Frame("첫 프레임");
		
		fr.setBackground(Color.blue);
		fr.setBounds(800,100,400,300);
		fr.setVisible(true);
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
