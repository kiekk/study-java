package JComponentEx;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/*
 	테이블 만들기
 */
class JTableMyModel extends AbstractTableModel{ //추상화된 테이블 모델, 컬럼의 개수나 테이블 모양등을 직접 지정
	Object [][] data = {
			{"2009-10123", "김길동"	,"차장",10,"naver@naver.com"},
			{"2009-10124", "이길동"	,"부장",20,"다음@naver.com"},
			{"2009-10125", "홍길동"	,"과장",30,"구글@naver.com"},
	};
	String[] columnName = {"사번","이름","직책","나이","메일"};
	@Override
	public int getRowCount() {
		return data.length;	//data의 개수는 3, data[0]의 개수는 5, 2차원 배열
	}
	@Override
	public int getColumnCount() {
		return columnName.length;
	}
	@Override		//데이터를 행, 열 단위로 채워 넣는다. 어떤 데이터를?
	//data.배열의 요소를 리턴하면
	//rowCount, colCount단위로 하나씩 채워 넣게 됩니다.
	public Object getValueAt(int rowIndex, int columnIndex) {
		//		return date[0][0]~date[n][n];
		return data[rowIndex][columnIndex];
	}		
	//필수는 아님
	@Override		//테이블 편집 가능 여부 리턴
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		//			return super.isCellEditable(rowIndex, columnIndex);
		return columnIndex !=0 ? true : false;
	}
	@Override
	public String getColumnName(int column) {	//컬럼의 갯수 만큼 이 메서드를 반복 호출해서, 칸에 이름을 하나씩 부여합니다.
		return columnName[column];
	}
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//		super.setValueAt(aValue, rowIndex, columnIndex);
		data[rowIndex][columnIndex] = aValue;		//특정 셀에 aValue값을 쓰게 되면, 그 값을 그대로 해당 셀에 반영합니다.
	}
}
public class JTableTest2 extends JFrame{
	JTable table;
	JTableMyModel model;	//추상화된 테이블을 갖고 있다. column, row, data...설계 -> 데이터 입력까지 만들어 놨습니다.
	public JTableTest2() {
		//사용자모델 객체 생성
		model = new JTableMyModel();
		//사용자모델 인스턴스를 테이블 클래스로 생성해봅니다.
		table = new JTable(model);	//사용자 정의한 모델로 테이블을 생성했습니다.
		add(new JScrollPane(table));
		setBounds(200, 200, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JTableTest2();
	}
}
