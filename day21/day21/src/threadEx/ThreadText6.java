package threadEx;

import java.text.SimpleDateFormat;
import java.util.Date;

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

public class ThreadText6 {
	public static void main(String[] args) {
		while(true) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(date));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
