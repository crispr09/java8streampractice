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
public class Stream8Sorted3 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(92);
		marks.add(83);
		marks.add(74);
		marks.add(55);
		marks.add(65);
		marks.add(35);
		marks.add(30);
		marks.add(22);
		System.out.println(marks);
		Comparator<Integer> c = ((i,j)->(i < j)?1:(i>j)?-1:0);
		List<Integer> lis = marks.stream().sorted( c).collect(Collectors.toList());
		System.out.println(lis);
		
	}

}
