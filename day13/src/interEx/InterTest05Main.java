package interEx;

interface Animator{}		//markup Interface
class Cinema{//영화
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
		//Film, Animation인지 체크하기
		for(int i = 0;i<arCinema.length;i++) {
			if(arCinema[i] instanceof Animator) {
				System.out.println(arCinema[i].name+"은 만화입니다.");
			}else {
				System.out.println(arCinema[i].name+"은 영화입니다.");
			}
		}
//		for(Cinema a : arCinema) {
//			if(a instanceof Animator) {
//				System.out.println(a.name+"은 만화입니다.");
//			}else {
//				System.out.println(a.name+"은 영화입니다.");
//			}
//		}
	}
}
public class InterTest05Main {

	public static void main(String[] args) {
		Film ryan = new Film("라이언일병구하기");
		Film iron = new Film("아이언맨");
		Film spider = new Film("스파이더맨");
		
		Animation digimon = new Animation("디지몬");
		Animation poketmon = new Animation("포켓몬");
		Animation frozen = new Animation("겨울왕국");
		Animation coco = new Animation("코코");
		Cinema []arCinema = {
				 spider, frozen, coco, iron, digimon, ryan};
		
		MovieWatching.watchChecking(arCinema); 		//~~제목은 영화입니다.
													//~~제목은 만화입니다.

	}

}
