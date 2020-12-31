package scanEx;

import java.util.ArrayList;

//컨트롤러
public class ScoreControl {
	ArrayList<Student> stdList = new ArrayList<>();
	int kT = 0,eT = 0,mT = 0, cnt = 0;
	//추가
	void add(int bun,String stdName,int kS,int eS,int mS) {
		//student 타입으로 객체 생성한 후
		//stdList에 add()시키면 됩니다.
		Student std = new Student(bun,stdName,kS,eS,mS);
		stdList.add(std);
		kT += kS;
		eT += eS;
		mT += mS;
		cnt++;
	}
	//목록 보기
	void outputScoreList() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		//stdList에 있는 데이터를 출력해 줍니다.
		//이때, 과목별 총점과 평균도 출력합니다.
		//국어 총점 : 000점 / 평균 : 000점
		//영어 총점 : 000점 / 평균 : 000점 
		//수학 총점 : 000점 / 평균 : 000점
		for(Student a : stdList) {
			System.out.println(a);
		}
		System.out.println("국어 총점 : "+kT+"점\t국어 평균 : "+kT/(double)cnt+"점");
		System.out.println("영어 총점 : "+eT+"점\t영어 평균 : "+eT/(double)cnt+"점");
		System.out.println("수학 총점 : "+mT+"점\t수학 평균 : "+mT/(double)cnt+"점");
	}
}
