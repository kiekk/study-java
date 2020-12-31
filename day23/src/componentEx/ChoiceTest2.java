package componentEx;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import frameEx.MyEventListener;

/*
 	Choice
 		드롭다운 리스트에서 하나를 선택합니다.
 		설정으로 여러개를 지정할 수 있습니다.
 */
public class ChoiceTest2 {
		static String result = "";
	public static void main(String[] args) {
		Frame f = new Frame("Choice");
		f.setBounds(500, 100, 500, 250);
		f.setLayout(null); 	//자동 배치 해제
		
		//구성품 컴포넌트 객체
		Choice day = new Choice();
		day.add("요일을 선택하세요.");
		day.add("일");
		day.add("월");
		day.add("화");
		day.add("수");
		day.add("목");
		day.add("금");
		day.add("토");
//		String result = ""; 익명 클래스도 하나의 클래스이기 때문에, 지역변수로 접근이 불가능합니다. 그래서 static으로 선언합니다.
//		static String result = "";  지역변수로 static 선언 불가능, 따라서 클래스 변수로 선언한 후 익명클래스에서 사용할 수 있도록 합니다.
		//Choice의 크기
		//컴포넌트 설정
		day.setSize(150,0);		//height가 0일 경우글자 크기에 맞춰서 높이가 결정됩니다. 글자 크기는 font로 설정 가능
		day.setLocation(50,100);
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(day.getSelectedIndex() != 0) {
					result = (String) e.getItem();
				}
//				System.out.println("소스.클래스.이름 : "+e.getSource().getClass().getName());
//				System.out.println("상태변화 : "+e.getStateChange());
//				System.out.println("ID : "+e.getID());
//				System.out.println("컴포넌트 이름 : "+day.getName());
//				System.out.println("day.selectedItem(String) : "+ day.getSelectedItem());
//				System.out.println("day.selectedItem(int) : "+day.getSelectedIndex());
			}
		});
	
		//1-1. 버튼
		Button btnOk = new Button("선택 확인");
		//1-1. 버튼 사이즈
		btnOk.setBounds(200,150, 100, 50);
		//1-3. 버튼 선택
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(result);
			}
		});
		//프레임에 컴포넌트 배치
		f.add(day);
		f.add(btnOk);
		//프레임 설정
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());
	}

}
