package java8progrms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * order sorting using comparator example- natural sorting
 *
 */
public class Stream13Sorted8IncreasingLength {

	public static void main(String[] args) {

		ArrayList<String> marks = new ArrayList<String>();
		marks.add("Wayn");
		marks.add("Kuma");
		marks.add("Raja");
		marks.add("Steve");
		marks.add("Jackson");
		marks.add("Richard");
		marks.add("Shobhit");
		marks.add("Williom D");

		marks.add("Carlos Markos");
		System.out.println(marks);
		
		Comparator<String> c = (i,j) -> {
			int l1 = i.length();
			int l2 = j.length();
			if(l1<l2) return -1;
			else if(l1>l2) return 1;
			else return 0;
			
		};
		

		List<String> lis2 = marks.stream().sorted(c).collect(Collectors.toList());
		System.out.println(lis2);

		
		List<String> lis3 = marks.stream().sorted((i,j) -> j.compareTo(i)).collect(Collectors.toList());
		System.out.println(lis3);
	}

}
