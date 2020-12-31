package threadEx;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 	프로세스 내부에 작업단위
 	최소한 하나의 프로세스(응용프로그램)은 하나의 쓰레드 이상을 가지고 있습니다.

 	 동기화 (synchronized)
 	 - lock 잠금
 	 멀티쓰레드 -> 스케줄러가 여러개의 쓰레드를 병렬 처리하게 됩니다.
 	 이 때, 순차적으로 하나의 쓰레드가 종료되기 전에 다른 쓰레드의 간섭을
 	 방지하는 방법으로 "동기화"가 사용됩니다.
 	   : 다른 쓰레드가 들어올 수 없습니다.
 	 반드시 필요한 경우에만 사용합니다.

 	 1. 메서드 전체영역에 동기화를 겁니다,
 	 synchronized 메서드(){
 	 	//임계영역 - 쓰레드가 공유하는 자원(인스턴스들)
 	 }

 	 2. 메서드 내부에서 동기화를 겁니다.
 	 메서드(){
 	 	synchronized(쓰레드 객체){
 	 		//임계영역 - 쓰레드가 공유하는 자원(인스턴스들)
 	 	}
 	 }
 */
/*
 	GUI 에 시간을 출력해봅니다.
 	   java.awt 패키지		javax.swing 패키지
 	- Frame					- JFrame		윈도우 창 만들 때 쓰는 클래스
 	- Label					- JLabel		텍스트 입력할 때 쓰는 사용합니다.
 	- Font					- Font			글자 크기, 모양등을 설정할 때 사용합니다.
 */
class DigitalClock extends JFrame implements Runnable {
	private Thread thread;
	private JLabel lbl;
	public DigitalClock(){
		super("디지털 시계");
		lbl = new JLabel();		//문장을 표시할 수 있는 Label객체 생성
		lbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
		lbl.setHorizontalAlignment(JLabel.CENTER);
		
		if(thread == null) {
			thread = new Thread(this);	//DigitalClock을 start 시키고 싶은 것
			thread.start();
		}

		this.add(lbl);

		//프레임 위치(좌표), 크기(가로세로)
		this.setBounds(200, 100, 350, 100);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void run() {
		//StringBuffer로 인스턴스를 한번만 생성한 뒤에 그 생성한 인스턴스를 가지고 작업을 합니다.
		//메모리절약
		StringBuffer now;
		while(true) {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date(cal.getTimeInMillis());
			now = new StringBuffer(sdf.format(date));
			lbl.setText(now.toString());
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
public class ThreadText6_1 {
	public static void main(String[] args) {
		new DigitalClock();		//프레임이 등장 -> Label에 의해서 시간이 흘러갑니다.

	}
}
