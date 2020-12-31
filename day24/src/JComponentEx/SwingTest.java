package JComponentEx;

import javax.swing.JFrame;

/*
 	swing은 awt 후속 GUI 패키지입니다.
 	awt보다 경량화 되어있습니다. (소스, 실행속도, 편의성이 높아짐)
 	디자인패턴에 많은 변화가 있습니다.(기존 리스너이벤트, 폰트 등 백도어 쪽 패키지는 그대로 awt를 사용합니다.)
 */
public class SwingTest extends JFrame{
	public SwingTest() {
		super("스윙 연습");
		setLocation(100, 100);
		setSize(500, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//dispose와 exit의 차이
		//dispose는 현재 걸려있는 컴포넌트만 메모리에서 없애는 것입니다.
		//exit는 실행중인 GUI프로그램 자체를 메모리에서 없애는 것입니다.
	}
	public static void main(String[] args) {
		

	}

}
