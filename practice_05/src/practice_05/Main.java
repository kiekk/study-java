package practice_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//	public static void main(String[] args) {
//		String[] cmds = {"PUSH 404","POP","PUSH 1631"};
//		int index = 0;
//		List<Integer> list = new ArrayList<>();
//        for(int i=0;i<cmds.length;i++){
//            if(cmds[i].equals("POP")){
//            	index++;
//            }
//            if(cmds[i].contains("PUSH")) {            	
//            	list.add(Integer.parseInt(cmds[i].substring(cmds[i].indexOf("PUSH")+5)));
//            }
//        }
//        int[] arr = new int[list.size()-index];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = list.get(i+index);
//        }
//        System.out.println(Arrays.toString(arr));
//	}
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		a += b += 3;
		System.out.println(a);
		a = a++ - (a++) * b;
		System.out.println(a);
		System.out.println(a + b);
		String aa = "aa";
		Object bb = "bb";
		aa.equals(bb);
		
	}
}
