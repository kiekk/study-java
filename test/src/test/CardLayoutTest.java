package test;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import myPanel.MyPanel1;

public class CardLayoutTest {

	public static void main(String args[]) {
		Frame f = new Frame("CardLayoutTest");	
		//JFrame f = new JFrame("CardLayoutTest");	
		CardLayout card = new CardLayout(10, 10);
		f.setLayout(card);
		
		MyPanel1 card1= new MyPanel1();
		
		Panel card2= new Panel();
		card2.add(new Label("Card 2"));
		card2.setBackground(Color.orange);
		Panel card3= new Panel();
		card3.add(new Label("Card 3"));
		card3.setBackground(Color.cyan);

		f.add(card1, "1");		// Frame�� card1�� "1"�̶�� �̸� �ٿ� �߰��Ѵ�.
		f.add(card2, "2");
		f.add(card3, "3");

		class Handler extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				// ���콺 ������ ��ư�� ��������
				if(e.getModifiers() == e.BUTTON3_MASK)	{
					card.previous(f);  //  CardLayout�� ���� Panel�� �����ش�.
				} else {
					card.next(f);	  //  CardLayout�� ���� Panel�� �����ش�.
				}
			}
		} // class Handler

		card1.addMouseListener(new Handler());
		card2.addMouseListener(new Handler());
		card3.addMouseListener(new Handler());
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setSize(400, 400);
		f.setLocation(200, 200);
		f.setVisible(true);

		// Frame�� �߰��� Component�� �̸��� "1"�� ���� �����ش�.
		card.show(f,"1");	
		
	}
}
