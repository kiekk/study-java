package practice_04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test_07 {
	public static void main(String[] args) {
		List<Score> scores = Arrays.asList(
					new Score("김사과",82,36,89),
					new Score("반하나",22,37,55),
					new Score("이메론",88,34,78),
					new Score("오렌지",91,99,22)
				);
		Map<String, List<Score>> result = scores.stream()
												.collect(Collectors.groupingBy(s -> {
													return (s.getMat() > 90) ? "A" :
														   (s.getMat() > 80) ? "B" : 
														   (s.getMat() > 70) ? "C" : 
														   (s.getMat() > 60) ? "D" : "F";
												}));
		result.keySet().forEach(key -> {
			System.out.println("수학 "+ key + " 학점");
			List<Score> score = result.get(key);
			score.stream().forEach(s -> System.out.println(s.getName()));
		});
	}
}

class Score {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
}
