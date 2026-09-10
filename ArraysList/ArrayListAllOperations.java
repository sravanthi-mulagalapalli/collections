package collections.ArraysList;
import java.util.ArrayList;
public class ArrayListAllOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1. Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // 2. Print the list
        System.out.println("Original List: " + list);
        // 3. Access element at index 2
        System.out.println("Element at index 2: " + list.get(2));
        // 4. Update element at index 2
        list.set(2, 100);
        System.out.println("After Update: " + list);
        // 5. Remove value 40
        list.remove(Integer.valueOf(40));
        System.out.println("After Remove: " + list);
        // 6. Find size
        System.out.println("Size: " + list.size());
        // 7. Final list
        System.out.println("Final List: " + list);
    }
}