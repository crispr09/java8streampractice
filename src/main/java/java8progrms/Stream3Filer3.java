package java8progrms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3Filer3 {

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
		List<Integer> updatedMarks = marks.stream().filter(i->i>34).collect(Collectors.toList());
		System.out.println(updatedMarks);
	}

}
