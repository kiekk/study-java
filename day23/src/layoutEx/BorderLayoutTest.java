package layoutEx;

import java.awt.BorderLayout;
import java.awt.Button;
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
public class BorderLayoutTest {
	static ActionListener click = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			//버튼1 ~버튼6  <--버튼의 타이틀은 g.getActionCommand()를 통해서 얻을 수 있습니다.
			//자바 : switch에서 문자열 비교도 됩니다.
			//콘솔에 버튼 1 클릭함..
//			switch(e.getActionCommand()){
//				case "동" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//				case "서" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//				case "남" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//				case "북" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//				case "중앙" : System.out.println(e.getActionCommand()+"를 클릭함");break;
//			}
			System.out.println(e.getActionCommand()+"를 클릭함");
		}
	};
	public static void main(String[] args) {
		Frame f = new Frame("보더 레이아웃");
		
		f.setLayout(new BorderLayout());
		
		Button btnE = new Button("동");
		Button btnW = new Button("서");
		Button btnS = new Button("남");
		Button btnN = new Button("북");
		Button btnC = new Button("중앙");
		
		//버튼 이벤트 단
		btnE.addActionListener(click);
		btnW.addActionListener(click);
		btnS.addActionListener(click);
		btnN.addActionListener(click);
		btnC.addActionListener(click);
		
		f.add(btnE,BorderLayout.EAST);
		f.add(btnW,BorderLayout.WEST);
		f.add(btnS,BorderLayout.SOUTH);
		f.add(btnN,BorderLayout.NORTH);
		f.add(btnC,BorderLayout.CENTER);
		//매개변수의 순서가 변경돼도, 정상 배치 가능합니다.
		
		f.setSize(400,300);
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());

	}

}
