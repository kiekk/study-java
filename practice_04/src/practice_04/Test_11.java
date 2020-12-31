package practice_04;

import java.util.Arrays;
import java.util.List;

public class Test_11 {
	public static void main(String[] args) {
		List<Score> scores = Arrays.asList(
				new Score("����",82,36,89),
				new Score("���ϳ�",22,37,55),
				new Score("�̸޷�",88,34,78),
				new Score("������",91,99,22)
			);
		boolean result1 = scores.stream().anyMatch(x -> x.getMat() > 39);
		System.out.println("���� ������ �ƴ� ����� �ֳ���? " + result1);
		boolean result2 = scores.stream().allMatch(x -> x.getKor() > 39);
		System.out.println("���� ������ ������? " + result2);
		boolean result3 = scores.stream().noneMatch(x -> x.getEng() > 39);
		System.out.println("����� ��� �����ΰ���? " + result3);
	}
}