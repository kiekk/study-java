package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTask {
	/*
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		
		String str = "ȫ�浿 010-1111-2222^��浿 011-222-2222^����� 016-2513-4574^��ġ 010-7777-0114^�Ѹ� " + 
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
		System.out.print("�ѱ۷θ� �̸��� �Է��ϼ��� :");
		while(sc.hasNext()) {
			String name = sc.next();
			if("0".equals(name)) {
				System.out.println("�����մϴ�.");
				return;
			}
			Pattern pattern = Pattern.compile("^[��-��|��-��|��-�R]*$");
			Matcher matcher = pattern.matcher(name);
			if(matcher.find()) {
				System.out.println("��� �ѱ��Դϴ�.");
			}else {
				System.out.println("�ѱ۷θ� �Է��ϼ���.");
			}
			System.out.print("�ѱ۷θ� �̸��� �Է��ϼ��� :");
		}
	}
}


