package collections.Stack;
import java.util.Stack;

public class StackCompletePractice {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // 1. push() - adds elements to the top
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);

        // 2. peek() - returns the top element
        System.out.println("Top element using peek(): " + stack.peek());

        // 3. pop() - removes and returns the top element
        System.out.println("Removed element using pop(): " + stack.pop());
        System.out.println("Stack after pop(): " + stack);

        // 4. push() again
        stack.push(50);
        System.out.println("Stack after adding 50: " + stack);

        // 5. search() - returns position from the top
        System.out.println("Position of 20 using search(): " + stack.search(20));
        System.out.println("Position of 100 using search(): " + stack.search(100));

        // 6. empty() - checks whether stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 7. size() - returns number of elements
        System.out.println("Stack size: " + stack.size());

        // 8. get() - accesses element using index
        System.out.println("Element at index 1: " + stack.get(1));

        // 9. set() - replaces element at an index
        stack.set(1, 200);
        System.out.println("Stack after set(): " + stack);

        // 10. contains() - checks whether an element exists
        System.out.println("Contains 30? " + stack.contains(30));
        System.out.println("Contains 100? " + stack.contains(100));

        // 11. indexOf()
        System.out.println("Index of 30: " + stack.indexOf(30));

        // 12. lastIndexOf()
        stack.push(30);
        System.out.println("Stack after adding 30 again: " + stack);
        System.out.println("Last index of 30: " + stack.lastIndexOf(30));

        // 13. firstElement()
        System.out.println("First element: " + stack.firstElement());

        // 14. lastElement()
        System.out.println("Last element: " + stack.lastElement());

        // 15. remove() - removes element by index
        stack.remove(1);
        System.out.println("Stack after remove(1): " + stack);

        // 16. removeElement() - removes element by value
        stack.removeElement(Integer.valueOf(30));
        System.out.println("Stack after removeElement(30): " + stack);

        // 17. add()
        stack.add(60);
        System.out.println("Stack after add(60): " + stack);

        // 18. addElement()
        stack.addElement(70);
        System.out.println("Stack after addElement(70): " + stack);

        // 19. clone()
        @SuppressWarnings("unchecked")
        Stack<Integer> clonedStack = (Stack<Integer>) stack.clone();

        System.out.println("Cloned stack: " + clonedStack);

        // 20. toArray()
        Object[] array = stack.toArray();

        System.out.print("Stack as array: [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        // 21. clear()
        stack.clear();
        System.out.println("Stack after clear(): " + stack);

        // 22. empty() after clear()
        System.out.println("Is stack empty after clear()? " + stack.empty());
    }
}