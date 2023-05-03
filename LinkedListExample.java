import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // create a linked list with elements "apple", "banana", and cherry"
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");

        // print the list
        System.out.println("The list is: " + linkedList);

        // print the list after adding "orange"
        linkedList.add("orange");

        // print the list after adding "orange"
        System.out.println("The list is: " + linkedList);

        // remove an element from the list
        linkedList.remove("banana");

        // print the list after removing an element
        System.out.println("The list is: " + linkedList);

        // get an element at a specific index
        String element = linkedList.get(1);
        System.out.println("Element at index 1: " + element);

        // print the size of the list
        int size = linkedList.size();
        System.out.println("The size of the list is: " + size);
    }
}
