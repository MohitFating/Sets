package Sets;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		//1 Create a Set
		Set<String> data = new HashSet<String>();
		//2 Add elements into set
		
		data.add("Mohit");
		data.add("Mohit Bhimrao");
		data.add("Mohit Fating");
		data.add("Mohit 1");
		data.add("Mohit 2");
		data.add("Mohit 3");
		
		System.out.println(data);
		//using loop to print
		for(String string:data)
		{
			System.out.println(string);
		}

	}

}
