package threadEx;
/*
 	프로세스 내부에 작업단위
 	최소한 하나의 프로세스(응용프로그램)은 하나의 쓰레드 이상을 가지고 있습니다.
 	
 	병렬처리
 	- 두 작업(메서드, 또는 객체) 이 동시에 실행될 수 있게 합니다.
 */
class Plus extends Thread{
	public Plus(String name) {
		super(name);
	}

	public void run() {
		for(int i = 0;i<10;i++) {
			try {
				System.out.println("+"+getName());
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	};
}
class Minus implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			try {
										//Runnable일 경우 currnetThread()메서드를 이용해서 getName()을 추출합니다.
				System.out.println("-"+Thread.currentThread().getName());
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
}
public class ThreadText {
	public static void main(String[] args) {
		//+,-가 동시에 실행될수 있게 만드는 것이 목표 - 병렬처리
		Plus plus = new Plus("플러스");
		plus.start();	//start()를 통해서 작업관리자에 "등록" 되고, 작업관리자(스케줄러)는 run 메서드를 찾아 run 메서드 내부의 작업을 실행하게 됩니다.
		Thread minus = new Thread(new Minus(),"마이너스");	//마이너스는 Runnable이므로 생성자를 통해 Thread에 name을 전달할 수 없습니다.
		minus.start();
		
	}
}
