package collections.ArraysList;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListCompletePractice {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // 1. add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println("Original List: " + list);

        // 2. get()
        System.out.println("Element at index 2: " + list.get(2));
        // 3. set()
        list.set(2, 100);
        System.out.println("After set(): " + list);
        // 4. remove()
        list.remove(Integer.valueOf(40));
        System.out.println("After remove(): " + list);
        // 5. size()
        System.out.println("Size: " + list.size());
        // 6. isEmpty()
        System.out.println("Is Empty: " + list.isEmpty());
        // 7. contains()
        System.out.println("Contains 100: " + list.contains(100));
        // 8. indexOf()
        System.out.println("Index of 20: " + list.indexOf(20));
        // 9. lastIndexOf()
        System.out.println("Last Index of 20: " + list.lastIndexOf(20));
        // 10. clone()
        ArrayList<Integer> clonedList =
                (ArrayList<Integer>) list.clone();

        System.out.println("Cloned List: " + clonedList);
        // 11. toArray()
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));
        // Create second ArrayList
        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(200);
        secondList.add(300);
        // 12. addAll()
        list.addAll(secondList);
        System.out.println("After addAll(): " + list);
        // 13. containsAll()
        System.out.println(
                "Contains all secondList elements: "
                + list.containsAll(secondList)
        );
        // 14. removeAll()
        list.removeAll(secondList);
        System.out.println("After removeAll(): " + list);
        // Create third ArrayList
        ArrayList<Integer> thirdList = new ArrayList<>();
        thirdList.add(20);
        thirdList.add(100);
        // 15. retainAll()
        list.retainAll(thirdList);
        System.out.println("After retainAll(): " + list);
        // 16. clear()
        list.clear();
        System.out.println("After clear(): " + list);
        // Check isEmpty() again
        System.out.println("Is Empty after clear: " + list.isEmpty());
    }
}