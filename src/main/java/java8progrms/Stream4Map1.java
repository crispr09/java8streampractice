package java8progrms;

import java.util.ArrayList;
import java.util.Collections;

public class Stream4Map1 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(1);
		marks.add(2);
		marks.add(3);
		marks.add(4);
		marks.add(5);
		System.out.println(marks);

		Integer lis = marks.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println(lis);
	}

}
