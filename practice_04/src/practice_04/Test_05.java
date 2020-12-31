package practice_04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test_05 {
	public static void main(String[] args) {
		List<Student> scores = Arrays.asList(
					new Student("김사과",82,36,89),
					new Student("반하나",22,37,55),
					new Student("이메론",88,34,88),
					new Student("오렌지",91,99,22)
				);
		System.out.println("국어가 최저 점수인 학생");
		scores.stream()
			  .collect(Collectors.minBy(Comparator.comparing(Student::getKor)))
			  .ifPresent(System.out::println);
		System.out.println("영어가 최고 점수인 학생");
		scores.stream()
			  .collect(Collectors.maxBy(Comparator.comparing(Student::getEng)))
			  .ifPresent(System.out::println);
		System.out.println("이름순으로 제일 빠른 학생");
		scores.stream()
			  .collect(Collectors.minBy(Comparator.comparing(Student::getName)))
			  .ifPresent(System.out::println);
		System.out.println("이름순으로 제일 느린 학생");
		scores.stream()
		  .collect(Collectors.maxBy(Comparator.comparing(Student::getName)))
		  .ifPresent(System.out::println);
	}
}

class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	public Student(String name, int kor, int eng, int mat) {
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
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
}
