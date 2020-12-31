package JComponentEx;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/*
 	���̺� �����
 */
class JTableMyModel extends AbstractTableModel{ //�߻�ȭ�� ���̺� ��, �÷��� ������ ���̺� ������ ���� ����
	Object [][] data = {
			{"2009-10123", "��浿"	,"����",10,"naver@naver.com"},
			{"2009-10124", "�̱浿"	,"����",20,"����@naver.com"},
			{"2009-10125", "ȫ�浿"	,"����",30,"����@naver.com"},
	};
	String[] columnName = {"���","�̸�","��å","����","����"};
	@Override
	public int getRowCount() {
		return data.length;	//data�� ������ 3, data[0]�� ������ 5, 2���� �迭
	}
	@Override
	public int getColumnCount() {
		return columnName.length;
	}
	@Override		//�����͸� ��, �� ������ ä�� �ִ´�. � �����͸�?
	//data.�迭�� ��Ҹ� �����ϸ�
	//rowCount, colCount������ �ϳ��� ä�� �ְ� �˴ϴ�.
	public Object getValueAt(int rowIndex, int columnIndex) {
		//		return date[0][0]~date[n][n];
		return data[rowIndex][columnIndex];
	}		
	//�ʼ��� �ƴ�
	@Override		//���̺� ���� ���� ���� ����
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		//			return super.isCellEditable(rowIndex, columnIndex);
		return columnIndex !=0 ? true : false;
	}
	@Override
	public String getColumnName(int column) {	//�÷��� ���� ��ŭ �� �޼��带 �ݺ� ȣ���ؼ�, ĭ�� �̸��� �ϳ��� �ο��մϴ�.
		return columnName[column];
	}
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//		super.setValueAt(aValue, rowIndex, columnIndex);
		data[rowIndex][columnIndex] = aValue;		//Ư�� ���� aValue���� ���� �Ǹ�, �� ���� �״�� �ش� ���� �ݿ��մϴ�.
	}
}
public class JTableTest2 extends JFrame{
	JTable table;
	JTableMyModel model;	//�߻�ȭ�� ���̺��� ���� �ִ�. column, row, data...���� -> ������ �Է±��� ����� �����ϴ�.
	public JTableTest2() {
		//����ڸ� ��ü ����
		model = new JTableMyModel();
		//����ڸ� �ν��Ͻ��� ���̺� Ŭ������ �����غ��ϴ�.
		table = new JTable(model);	//����� ������ �𵨷� ���̺��� �����߽��ϴ�.
		add(new JScrollPane(table));
		setBounds(200, 200, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JTableTest2();
	}
}
