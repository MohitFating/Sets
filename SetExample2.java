import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        // Create a HashSet to store integers
        Set<Integer> numberSet = new HashSet<>();

        // Add elements to the set
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);
        numberSet.add(10); // Adding a duplicate value, but it won't be added to the set

        // Print the set
        System.out.println("Number Set: " + numberSet);

        // Check if an element is present in the set
        int targetNumber = 10;
        if (numberSet.contains(targetNumber)) {
            System.out.println(targetNumber + " is present in the set.");
        } else {
            System.out.println(targetNumber + " is not present in the set.");
        }

        // Remove an element from the set
        int numberToRemove = 15;
        if (numberSet.remove(numberToRemove)) {
            System.out.println(numberToRemove + " removed from the set.");
        } else {
            System.out.println(numberToRemove + " is not present in the set, so cannot remove it.");
        }

        // Print the updated set
        System.out.println("Updated Number Set: " + numberSet);

        // Get the size of the set
        System.out.println("Size of the set: " + numberSet.size());

        // Clear the set
        numberSet.clear();
        System.out.println("Cleared Number Set: " + numberSet);
    }
}
