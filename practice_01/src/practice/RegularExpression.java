package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String str1 = "���� �ҳ��Դϴ�.";
		String str2 = "I am a boy";
		Pattern pattern = Pattern.compile("[��-��|��-��|��-�R]");
		Matcher m1 = pattern.matcher(str1);
		Matcher m2 = pattern.matcher(str2);
		
		System.out.println("[" + str1 + "] �ѱ��� ���ԵǾ�����? " + m1.find());
		System.out.println("[" + str2 + "] �ѱ��� ���ԵǾ�����? " + m2.find());
		
	}
}
