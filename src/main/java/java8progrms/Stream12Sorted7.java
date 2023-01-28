package java8progrms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * order sorting using comparator example- natural sorting
 *
 */
public class Stream12Sorted7 {

	public static void main(String[] args) {

		ArrayList<String> marks = new ArrayList<String>();
		marks.add("Kumar");
		marks.add("Raja");
		marks.add("Steve");
		marks.add("Jackson");
		marks.add("Richard");
		marks.add("Shobhit");
		marks.add("Williom");
		marks.add("Wayn");
		marks.add("Carlos");
		System.out.println(marks);
		
		List<String> lis2 = marks.stream().sorted((i,j) -> i.compareTo(j)).collect(Collectors.toList());
		System.out.println(lis2);
		
		List<String> lis3 = marks.stream().sorted((i,j) -> -i.compareTo(j)).collect(Collectors.toList());
		System.out.println(lis3);
	}

}
