package java8progrms;

import java.util.ArrayList;

/*
 * filer to get only marks >= 60 and count them
 */
public class Stream2Filer2 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(92);
		marks.add(83);
		marks.add(74);
		marks.add(55);
		marks.add(65);
		marks.add(35);
		marks.add(30);
		marks.add(22);
		System.out.println(marks);
		long count = marks.stream().filter(i->i>=60).count();
		System.out.println(count);
	}

}
