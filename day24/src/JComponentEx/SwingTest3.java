package JComponentEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/*
 	������ư
 	��ư�׷�
 	üũ�ڽ�
 	�������̾ƿ��� ������ �����մϴ�.(JFrame �� ����)
 */
public class SwingTest3 extends JFrame {
	//������ư
	String[] strMem = {"��ȸ��","ȸ��","���ȸ��"};
	JRadioButton[] rbMem = new JRadioButton[strMem.length];
	ButtonGroup bgMem = new ButtonGroup();	//��ư �׷� = ��ư�� �ϳ��� �׷����� ����
	JComboBox<Object> combo = new JComboBox<>(); //�޺� �ڽ�
	String[] strFood = {"�����","���","����","���̽�ũ��"};
	JCheckBox[] cbFood = new JCheckBox[strFood.length];
	
	//����Ʈ �ڽ�
	JList<Object> list;
	
	//�г�
	JPanel mainCenter = new JPanel();
	JPanel mainEast = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	//������
	public SwingTest3() {
		mainCenter.setLayout(new BorderLayout());//�г��� FlowLayout->Border�� ������ ����
												//�г��� ������ ������ ������ ����
		add(mainCenter, BorderLayout.CENTER);
		add(mainEast, BorderLayout.EAST);
		
		mainCenter.add(p1,BorderLayout.NORTH);		//p1�� ������ ���ʿ� ���Դϴ�.
		mainCenter.add(p2, BorderLayout.CENTER);	//p2�� ������ �߾ӿ� ���Դϴ�.
		//p1 �г� ���� ����
		p1.setLayout(new GridLayout(1,0));		//1��¥�� gridLayout ����(������ư ��ġ)
		
		//p1�� �� ������ư ����
		for(int i = 0;i<strMem.length;i++) {
			rbMem[i] = new JRadioButton(strMem[i]);
			bgMem.add(rbMem[i]);
			p1.add(rbMem[i]);
		}
		
		//�޺��ڽ� - ������ �������� ������ �� �ִ� ����ǰ
		//�޺��ڽ��� �ð��� �����մϴ�.
		for(int i = 1;i<48;i++) {
			combo.addItem(i+"�ð�");
		}
		//p1 �гο� �޺��ڽ� ���̱�
		p1.add(combo);
		
		//��p2 �г��� border�� ������ ������ ������ ������
		//setBorder : ������ ȭ�鿡 Ÿ��Ʋ ��ư ���� �� �׵θ� ������ �����մϴ�.
		p2.setBorder(
				new TitledBorder(
						new EtchedBorder(),
						"�����Ÿ�",
						TitledBorder.LEFT,
						TitledBorder.TOP,
						new Font("����",Font.PLAIN,11),
						Color.GREEN
						)
				);
		//p2�� ���� ���� ����(������ ȭ���� Ʋ ���� ����)
		//������ ������ GridLayout���� �����մϴ�.  <-- ������ ���ο� ������ Grid�� ����
		p2.setLayout(new GridLayout(1, 0));
		
		for(int i = 0;i<strFood.length;i++) {
			cbFood[i] = new JCheckBox(strFood[i]);
			p2.add(cbFood[i]);
		}
		mainEast.setBorder(
				new TitledBorder(
						new EtchedBorder(),
						"�����Ÿ�",
						TitledBorder.LEFT,
						TitledBorder.TOP,
						new Font("����",Font.PLAIN,11),
						Color.GREEN
						)
				);
//		ArrayList<String> arrList = new ArrayList<>();	//JList���� ArrayList�� �������� �ʽ��ϴ�.
		Vector<String> arrList = new Vector<>();
		for(int i = 0;i<=100;i++) {
			arrList.add(i+"000 �� ����");
		}
		list = new JList<>(arrList);		//����Ʈ�� �������� �׸��� �����ϰ� ������ �� �ֵ��� �ϴ� ����ǰ
											//�÷��� �߿� Vector�� �����ϱ� ������, ArrayList-> Vector�� ����
		list.setVisibleRowCount(4);			//ó�� ������ ��, 4�� �׸������� �̸� �����ݴϴ�.
											//�������� ��ũ�ѷ� �� �� �ֽ��ϴ�.
		mainEast.add(new JScrollPane(list));
		setVisible(true);
		setBounds(300, 300, 600, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingTest3();
		
	}
}
