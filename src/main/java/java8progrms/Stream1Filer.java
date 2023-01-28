package java8progrms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1Filer {

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
		
		
		//
		List<Integer> updatedMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		
		
		
		Integer lis =marks.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println(lis);
	
	}
	public void add5GraceMarks(ArrayList<Integer> marks) {
		
	}

}
