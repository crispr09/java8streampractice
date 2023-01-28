package java8progrms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1Filer1 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(1);
		marks.add(2);
		marks.add(3);
		marks.add(4);
		marks.add(5);
		System.out.println(marks);
		List<Integer> li = marks.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(li);
		
		
	}

}
