package interEx;

interface Listener{
	void event();
	void draw();
	void move();
	void remove();
	void click();
	void release();
}
interface Event{
	void popup();
	void menu();
}
interface Window{
	void dialog();
	void drag();
}
//interface�� �߻�޼����߿��� ���ϴ� �޼��常 ��� �������Ͽ� ����ϰ��� �Ҷ�, adapter��� Ŭ����(����,�߰��ڿ���)�� �̿��մϴ�.
abstract class Adapter implements Listener, Event, Window{		//��¡�� �ǹ̷� abstractŰ���带 ���Դϴ�.
	@Override
	public void dialog() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drag() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void event() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void popup() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}
	
}
class MyListener extends Adapter{
	@Override
	public void click() {
		// TODO Auto-generated method stub
		super.click();
	}
	
}
public class InterTest02 {

	public static void main(String[] args) {

	}

}
