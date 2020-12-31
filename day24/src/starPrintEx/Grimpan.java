package starPrintEx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grimpan extends JFrame implements MouseMotionListener {
	int x = 0;
	int y = 0;
	DrawPanel dr;	//내부 클래스 객체
	class DrawPanel extends JPanel{
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.drawString("*", x, y);
			//프레임의 크기만큼 해당 영역을 clear 하게 됩니다.
//			g.clearRect(0, 0, 300, 300);
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		this.x = e.getX()-10;		//-10, -23은 화살표 포인터에서 그려질 수 있도록 좌표값을 설정
		this.y = e.getY()-23;		// 초기값은 마우스 포인터의 꼬리부분에서 시작
		dr.repaint(); //그림을 유지하고 계속 그릴수 있게 합니다. 그림을 반영합니다.
	}
	public Grimpan(String title) {
		super(title);
		setBackground(Color.WHITE);
		add(dr = new DrawPanel());		//내부 패널 붙이기
		addMouseMotionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Grimpan("그림판");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
