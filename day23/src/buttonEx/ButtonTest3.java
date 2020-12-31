package buttonEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameEx.MyEventListener;

/*
 	Button
 		버튼 이벤트 처리
 		
 */
public class ButtonTest3 {

	public static void main(String[] args) {
		Frame f = new Frame("버튼 테스트");
		f.setBounds(300,200,400,400);
		f.setLayout(null);	//레이아웃 자동 설정을 끕니다.
							//그러면, 프레임에 add되는 구성품들 고유의 위치와 크기를 정하는데로, 표시할 수 있게 됩니다.
		//#1.버튼 만들기
		//#1-1.구현
		Button btnOk = new Button("확인");
		btnOk.setBounds(70, 90, 100, 50);
		Button btnClose = new Button("닫기");
//		btnClose.setBounds(190, 90, 100, 50);
		btnClose.setBounds(btnOk.getBounds());
		btnClose.setLocation(btnOk.getX()+btnOk.getWidth()+10, btnOk.getY());
		
		//#1-2.이벤트 처리하기
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인 버튼이 눌렸습니다.");
				System.out.println("액션 커맨드 : " +e.getActionCommand());
				System.out.println("액션 커맨드 : " +e.getClass().getCanonicalName());
				System.out.println("액션 커맨드 : " +e.getID());
				System.out.println("액션 커맨드 : " +e.getModifiers());
				System.out.println("액션 커맨드 : " +e.getWhen());	//버튼이 눌린 시간
				
			}
		});
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("닫기 버튼이 눌렸습니다.");
				System.exit(0);
			}
		});
		//버튼 붙이기
		f.add(btnOk);
		f.add(btnClose);
		//프레임 보이기
		f.setVisible(true);
		//프레임 종료이벤트 처리
		f.addWindowListener(new MyEventListener());
	}

}
