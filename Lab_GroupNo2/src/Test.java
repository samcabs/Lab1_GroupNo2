import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		//Integers Class
/*
		ArrayList<Integer> testInts = new ArrayList();
		testInts.add(5);
		testInts.add(10);
		testInts.add(15);
		testInts.add(20);
		
		System.out.println(Integers.computeSum(testInts));
		*/

		
		//Date Class
		
		Date d1 = new Date (8, 10, 2020);
		Date d2 = new Date (8, 20, 2020);
		Date d3 = new Date (4, 16, 2005);
		Date d4 = new Date (3, 24, 2010);

		
/*
		if(d1.compareTo(d2)==1) {
			System.out.println(d1 + " is later than " + d2);
		}else if(d1.compareTo(d2) == -1) {
			System.out.println(d1 + " is earlier than " + d2);
		}else {
			System.out.println(d1 + " and " + d2 + " are the same dates...");
		}
		*/
		
		//TreeMap
		
		TreeMap<Date, String> syllabus = new TreeMap();
		syllabus.put(d1, "java");
		syllabus.put(d2, "Python");
		syllabus.put(d3, "C++");
		syllabus.put(d4, "Javascript");
		
		for(Map.Entry<Date, String> topic: syllabus.entrySet()) {
			if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
				System.out.println(topic.getValue());
			}else {
				System.out.println(topic.getValue() + " does not fall in September, 2002");
			}
		}

	}
	/*	
		static void getSquare(int n) {
			for(int i=0; i < n || i==n; i++) {
				System.out.println("the square of "+ i + " is "+ i*i);
			}
		}
		
		static void getSquare2(int i, int n) {
			if(i < n || i==n) {
				System.out.println(i + ", " + i*i);
				getSquare2(i + 1, n);
			}else {
				return;
			}
		
		}
		*/
}


