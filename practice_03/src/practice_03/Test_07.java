package practice_03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_07 {
	public static void main(String[] args) {
		List<ScoreBoard> boards = Arrays.asList(
			new ScoreBoard("김사과",50,60,70),
			new ScoreBoard("이메론",20,90,80),
			new ScoreBoard("반하나",55,65,75)
		);
		boards.stream()
			  .sorted()
			  .collect(Collectors.toList())
			  .forEach(System.out::println);
	}
}

class ScoreBoard implements Comparable<ScoreBoard>{
	private String name;
	private int score1;
	private int score2;
	private int score3;
	
	
	public ScoreBoard(String name, int score1, int score2, int score3) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore1() {
		return score1;
	}


	public void setScore1(int score1) {
		this.score1 = score1;
	}


	public int getScore2() {
		return score2;
	}


	public void setScore2(int score2) {
		this.score2 = score2;
	}


	public int getScore3() {
		return score3;
	}


	public void setScore3(int score3) {
		this.score3 = score3;
	}
	
	

	@Override
	public String toString() {
		return "ScoreBoard [name=" + name + ", score1=" + score1 + ", score2=" + score2 + ", score3=" + score3 + "]";
	}


	@Override
	public int compareTo(ScoreBoard o) {
		return o.getName().compareTo(this.getName());
	}
}
