package JComponentEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.*;

public class SwingTest2 extends JFrame {
	JPanel west = new JPanel();
	JPanel south = new JPanel(new FlowLayout(FlowLayout.RIGHT));	//������ ����


	//�ؽ�Ʈ �ʵ忡�� ����� ����
	String[] caption = {"��� : ","�̸� : ","��å : ","�μ� : ","���� : "};
	String[] caption2 = {"��ü","�߰�","�˻�","����","����"};

	//��� ������ �Է¹ޱ� ���� �гθ����
	//���̺� �ؽ�Ʈ �ʵ� �迭 �����ϱ�
	JPanel jp[] = new JPanel[5];
	JLabel jl[] = new JLabel[5];
	JTextField tf[] = new JTextField[5];

	//��ư 5�� �迭 ����
	JButton [] jb = new JButton[5];

	//�ڱ� �Ұ��� �ޱ� ���� textarea ����, ������ ����� �� �ֱ� ������,
	//��ũ�� �г��� ���� ����ϴ�.

	JTextArea jta;
	JScrollPane sp;

	//�����ڿ��� ������ ��ü ����(Ư��, �迭 ��ü ����)
	public SwingTest2(){
		//west���� �ؽ�Ʈ �ʵ� ���̱�.
		west.setBackground(Color.PINK);
		west.setLayout(new GridLayout(5, 1, 10, 10));

		//south���� ��ư ���̱�
		south.setBackground(Color.YELLOW);
		for(int i = 0;i<caption.length;i++) {
			jl[i] = new JLabel(caption[i]);	//String�迭���� �ϳ��� �����ͼ� label�� ���Դϴ�.
			tf[i] = new JTextField(6);		

			//�г� ���� - ������ ��ȫ��
			jp[i] = new JPanel();
			jp[i].setBackground(Color.PINK);

			//���̺�� ��ư�� �гο� �߰��մϴ�.
			//���̺�� ��ư�� �߰��� �г��� west �гο� �߰��մϴ�.
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			west.add(jp[i]);	//���� 5���� �г��� west�� �ٿ����ϴ�.
		}//end for(west)
		//��ũ���� �����ϴ� �гο� TextArea�� �ٿ����ϴ�.
		jta = new JTextArea("  �ڰ��Ұ����� ������",15,15);
		sp = new JScrollPane(jta);

		for(int i = 0;i<caption2.length;i++) {
			jb[i] = new JButton(caption2[i]);		//��ư ����
			south.add(jb[i]);						//���� 5���� �г��� south�� �ٿ����ϴ�.
		}//end for(south)
		//west, south�� ���� �г� ���� �Ϸ�
		
		//JFrame�� �ٿ����ϴ�.
		add(west, BorderLayout.WEST);
		add(sp,BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		setVisible(true);
		//pack();  ���� ������ ��ŭ ũ�⸦ ����ݴϴ�.
		setBounds(300, 300, 500, 280);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new SwingTest2();
	}
}
