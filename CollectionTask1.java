//Write a program to demonstrate arraylist and its methods(add,set,size,isEmpty,get,remove) 
import java.util.ArrayList;

public class CollectionTask1 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Printing the ArrayList
        System.out.println("ArrayList after adding elements: " + list);

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + list.isEmpty());

        // Getting element at index 1
        System.out.println("Element at index 1: " + list.get(1));

        // Removing element at index 1
        list.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + list);

        // Adding element at index 1
        list.add(1, "Grapes");
        System.out.println("ArrayList after adding 'Grapes' at index 1: " + list);

        // Setting element at index 0
        list.set(0, "Mango");
        System.out.println("ArrayList after setting 'Mango' at index 0: " + list);
    }
}
