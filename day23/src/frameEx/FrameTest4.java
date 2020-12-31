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

		//프레임의 제목을 "네번째 프레임"
		//MyFrame, MyEventListener 을 이용해서 프레임을 생성해봅니다.
		
		MyFrame mf = new MyFrame();
		mf.setTitle("네번째 프레임");
		mf.addWindowListener(new MyEventListener());
	}

}
