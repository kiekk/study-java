package practice_04;

import java.util.Arrays;
import java.util.List;

public class Test_11 {
	public static void main(String[] args) {
		List<Score> scores = Arrays.asList(
				new Score("김사과",82,36,89),
				new Score("반하나",22,37,55),
				new Score("이메론",88,34,78),
				new Score("오렌지",91,99,22)
			);
		boolean result1 = scores.stream().anyMatch(x -> x.getMat() > 39);
		System.out.println("수학 과락이 아닌 사람이 있나요? " + result1);
		boolean result2 = scores.stream().allMatch(x -> x.getKor() > 39);
		System.out.println("국어 과락이 없나요? " + result2);
		boolean result3 = scores.stream().noneMatch(x -> x.getEng() > 39);
		System.out.println("영어는 모두 과락인가요? " + result3);
	}
}