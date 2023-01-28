package java8progrms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4Map2 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(1);
		marks.add(2);
		marks.add(3);
		marks.add(4);
		marks.add(5);
		System.out.println(marks);

		List<Integer> lis = marks.stream().map(i -> i+100).collect(Collectors.toList());
		System.out.println(lis);
	}

}
