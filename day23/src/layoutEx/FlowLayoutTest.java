package layoutEx;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameEx.MyEventListener;
/*
 	Layout
 	 - 컨테이너에 배치하는 방법
 	 - 컨테이너는 자동으로 layout이 정해져 있습니다.
 			Frame, Dailog : BorderLayout
 			Panel, Applet(a) : FlowLayout 기본 지정
 	-레이아웃 매니저 : setLayout(new BorderLayout());
 								(new FlowLayout());
 								(null);	<--컨테이너에 배치될 구성품들은 고유의 크기를 가지고 있어야 합니다.
 	- BorderLayout
 				:5개 영역으로 구분되어 있습니다.
 					East, West, South, North, Center
 					기본 지정은 Center 입니다.
 					
 	- FlowLayout
 				: 수평으로 순서대로 늘어트립니다.
 				: 창의 크기가 좁아지면 자동으로 아래로 내려갑니다.
 				: 구성품 간의 간격을 gap 이라고 합니다. (수직, 수평 간격을 설정할 때 사용합니다.)
 	- 기타 : GridLayout, GridBagLayout, CardLayout...
 				칸 - 행열단위				(여러개의 카드를 쌓아놓는 방식으로 배치합니다.)
 */
public class FlowLayoutTest {
	static ActionListener click = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			//버튼1 ~버튼6  <--버튼의 타이틀은 g.getActionCommand()를 통해서 얻을 수 있습니다.
			//자바 : switch에서 문자열 비교도 됩니다.
			//콘솔에 버튼 1 클릭함..
//			switch(e.getActionCommand()){
//				case "버튼1" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//				case "버튼2" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//				case "버튼3" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//				case "버튼4" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//				case "버튼5" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//				case "버튼6" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//			}
			System.out.println(e.getActionCommand()+"를 클릭함");
		}
	};
	public static void main(String[] args) {
		Frame f = new Frame("플로우 레이아웃");
		
		f.setLayout(new FlowLayout());
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		Button btn6 = new Button("버튼6");
		
		//버튼 이벤트 단
		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);
		btn4.addActionListener(click);
		btn5.addActionListener(click);
		btn6.addActionListener(click);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		
		f.setSize(400,300);
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());

	}

}
