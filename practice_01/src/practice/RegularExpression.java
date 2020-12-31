package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String str1 = "³ª´Â ¼Ò³âÀÔ´Ï´Ù.";
		String str2 = "I am a boy";
		Pattern pattern = Pattern.compile("[¤¡-¤¾|¤¿-¤Ó|°¡-ÆR]");
		Matcher m1 = pattern.matcher(str1);
		Matcher m2 = pattern.matcher(str2);
		
		System.out.println("[" + str1 + "] ÇÑ±ÛÀÌ Æ÷ÇÔµÇ¾ú³ª¿ä? " + m1.find());
		System.out.println("[" + str2 + "] ÇÑ±ÛÀÌ Æ÷ÇÔµÇ¾ú³ª¿ä? " + m2.find());
		
	}
}
