package interEx;

interface Animator{}		//markup Interface
class Cinema{//��ȭ
	String name;
	Cinema(String name){
		this.name = name;
	}
}
class Film extends Cinema{

	public Film(String name) {
		super(name);
	}
	
}
class Animation extends Cinema implements Animator{

	public Animation(String name) {
		super(name);
	}
	
}
class MovieWatching{
	static void watchChecking(Cinema []arCinema) {
		//Film, Animation���� üũ�ϱ�
		for(int i = 0;i<arCinema.length;i++) {
			if(arCinema[i] instanceof Animator) {
				System.out.println(arCinema[i].name+"�� ��ȭ�Դϴ�.");
			}else {
				System.out.println(arCinema[i].name+"�� ��ȭ�Դϴ�.");
			}
		}
//		for(Cinema a : arCinema) {
//			if(a instanceof Animator) {
//				System.out.println(a.name+"�� ��ȭ�Դϴ�.");
//			}else {
//				System.out.println(a.name+"�� ��ȭ�Դϴ�.");
//			}
//		}
	}
}
public class InterTest05Main {

	public static void main(String[] args) {
		Film ryan = new Film("���̾��Ϻ����ϱ�");
		Film iron = new Film("���̾��");
		Film spider = new Film("�����̴���");
		
		Animation digimon = new Animation("������");
		Animation poketmon = new Animation("���ϸ�");
		Animation frozen = new Animation("�ܿ�ձ�");
		Animation coco = new Animation("����");
		Cinema []arCinema = {
				 spider, frozen, coco, iron, digimon, ryan};
		
		MovieWatching.watchChecking(arCinema); 		//~~������ ��ȭ�Դϴ�.
													//~~������ ��ȭ�Դϴ�.

	}

}
