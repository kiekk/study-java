package menuCompEx;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
 	�����ӿ���
 		������ ���콺 ��ư�� ������, �޴��� ���ɴϴ�.
 */
public class PopupMenuTest {

	public static void main(String[] args) {
		Frame f = new Frame("�˾� �޴�");
		
		f.setSize(300,300);
		//�˾� �޴� ��ü ����
		
		PopupMenu pMenu = new PopupMenu("����");	//�˾� �޴� Ÿ��Ʋ�� ������ �ʽ��ϴ�.
		
		//�˾��޴��� �޴�ó��, ���� �޴��� ������ "Menu" ������ "MenuItem" ���� �׸��� ����ϴ�.
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		//�����ӿ� �˾� �޴��� �ٿ� �����ϴ�.
		f.add(pMenu);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//�˾��޴� �̺�Ʈ ��� - ���콺 ������ ��ư ������ �� ����
		f.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//���콺 3��° ��ư		�� - 1 �� - 2 �� - 3
//				System.out.println(e.getButton());
//				System.out.println(e.getID());
//				System.out.println(e.getClickCount());
//				System.out.println(e.getModifiers());
				if(e.getButton() == MouseEvent.BUTTON3) {
					pMenu.show(f, e.getX(), e.getY());
				}
//				if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {		//BUTTON#_MASK�� ã�� ���� getModifiers()�� ã�ƾ� �մϴ�.
//					pMenu.show(f, e.getX(), e.getY());
//				}
			}
		});

	}

}
