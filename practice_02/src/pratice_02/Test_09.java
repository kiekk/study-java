package pratice_02;

import java.util.Iterator;
import java.util.TreeSet;

public class Test_09 {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();

		System.out.println(treeSet.add(new Fruit("포도", 10)));
		System.out.println(treeSet.add(new Fruit("청포도", 10)));
		System.out.println(treeSet.add(new Fruit("건포도", 10)));
		Iterator<Fruit> iterator = treeSet.iterator();
        while(iterator.hasNext()){
        	Fruit fruit = iterator.next();
            System.out.println(fruit.getName() + "  :  " + fruit.getAge());
        }
	}
}

class Fruit implements Comparable<Fruit>  {
	String name;
	int age;
	
	public Fruit(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Fruit o) {
		 if(age < o.getAge()) return -1;
	        else return 1;
	}
}
