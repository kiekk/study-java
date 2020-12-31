package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTask {
	/*
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		
		String str = "È«±æµ¿ 010-1111-2222^°í±æµ¿ 011-222-2222^µµ¿ì³Ê 016-2513-4574^¶ÇÄ¡ 010-7777-0114^µÑ¸® " + 
				"010-7777-7777";
		String regex = "[[01(?:0|1|[6-9])[-]([0-9] {3}|[0-9] {4})[-][0-9]{4}]]*";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			if(!"".equals(m.group())) list.add(m.group());
		}
		System.out.println(list.toString());
	}
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇÑ±Û·Î¸¸ ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä :");
		while(sc.hasNext()) {
			String name = sc.next();
			if("0".equals(name)) {
				System.out.println("Á¾·áÇÕ´Ï´Ù.");
				return;
			}
			Pattern pattern = Pattern.compile("^[¤¡-¤¾|¤¿-¤Ó|°¡-ÆR]*$");
			Matcher matcher = pattern.matcher(name);
			if(matcher.find()) {
				System.out.println("¸ðµÎ ÇÑ±ÛÀÔ´Ï´Ù.");
			}else {
				System.out.println("ÇÑ±Û·Î¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
			}
			System.out.print("ÇÑ±Û·Î¸¸ ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä :");
		}
	}
}


