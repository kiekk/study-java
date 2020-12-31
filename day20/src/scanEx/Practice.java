package scanEx;

import java.util.EnumSet;

public class Practice {

	public static void main(String[] args) {
		System.out.println("=== 우리 동물원에 있는 조류의 수 ===");
		EnumSet<BIRD> birds = EnumSet.allOf(BIRD.class);
		for(BIRD bird : birds) {
			System.out.printf("%s, %d 마리\n",bird.getName(),bird.getCount());
		}
	}
}
enum BIRD {
	SPARROW("참새",33), PARROT("앵무새",27), EAGLE("독수리",2), FALCON("매",8);
	
	private final String name;	//이름
	private final int count;	//마리수
	private BIRD(String name, int count) {
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
}