package buttonEx;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

import javax.swing.JButton;

import frameEx.MyEventListener;

/*
 	Button
 		- Container�� ����ǰ �� �ϳ�
 		- Container�� �⺻������ ���̾ƿ��� ���� �ִµ�,
 			���̾ƿ��� ������ ���� ��ư�� ũ�Ⱑ �ڵ����� �����˴ϴ�.
 		- Container ���̾ƿ��� ������ null�� �����, ��ư�� ũ����
 			������ �� �ְ� �˴ϴ�.
 		�� Container : Frame, Panel ��
 				�⺻ ���̾ƿ��� BorderLayout
 */
public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame("��ư �׽�Ʈ");
		f.setBounds(300,200,400,400);
		f.setLayout(null);	//���̾ƿ� �ڵ� ������ ���ϴ�.
							//�׷���, �����ӿ� add�Ǵ� ����ǰ�� ������ ��ġ�� ũ�⸦ ���ϴµ���, ǥ���� �� �ְ� �˴ϴ�.
		//��ư �����
		JButton btnOk = new JButton("Ȯ��");
		btnOk.setBounds(70, 90, 100, 50);
		Button btnClose = new Button("�ݱ�");
//		btnClose.setBounds(190, 90, 100, 50);
		btnClose.setBounds(btnOk.getBounds());
		btnClose.setLocation(btnOk.getX()+btnOk.getWidth()+10, btnOk.getY());
		//��ư ���̱�
		btnClose.setBackground(Color.white);
		f.add(btnOk);
		f.add(btnClose);
		//������ ���̱�
		f.setVisible(true);
		//������ �����̺�Ʈ ó��
		f.addWindowListener(new MyEventListener());
	}

}
