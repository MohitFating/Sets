package Sets;
import java.util.*;

public class Operations_on_Sets_Interface {

	public static void main(String[] args) {
		
		// Declaring Set 1
		Set<Integer> data1 = new HashSet<Integer>();
		
		// Adding All Element To Set List
		data1.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,0}));

		// Declaring Set 2
		Set<Integer> data2 = new HashSet<Integer>();
		
		// Adding All Element To Set List
		data2.addAll(Arrays.asList(new Integer[] {1,2,4,6,7,2}));

		// To find union
		Set<Integer> union = new HashSet<Integer>(data1);
		union.addAll(data2);
		System.out.println("Union of the Two Set - \n"+union);
		
		// To find Intersection
		Set<Integer> intersection = new HashSet<Integer>(data1);
		intersection.retainAll(data2);
		System.out.println("Itersection of Two Set - \n"+intersection);
		
		//Find Symmetric Difference
		
		Set<Integer> difference = new HashSet<Integer>(data1);
		difference.removeAll(data2);
		System.out.println("Difference of Two set - \n"+difference);
	}

}
