package collections.Vector;
import java.util.Vector;
public class VectorCompletePractice {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        // 1. add()
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(20);
        vector.add(40);
        System.out.println("Original Vector: " + vector);
        // 2. addElement()
        vector.addElement(50);
        System.out.println("After addElement(): " + vector);
        // 3. get()
        System.out.println("Element at index 2: " + vector.get(2));
        // 4. elementAt()
        System.out.println("Element at index 1: " + vector.elementAt(1));
        // 5. set()
        vector.set(2, 100);
        System.out.println("After set(): " + vector);
        // 6. setElementAt()
        vector.setElementAt(200, 3);
        System.out.println("After setElementAt(): " + vector);
        // 7. size()
        System.out.println("Size: " + vector.size());
        // 8. capacity()
        System.out.println("Capacity: " + vector.capacity());

        // 9. isEmpty()
        System.out.println("Is Empty: " + vector.isEmpty());
        // 10. contains()
        System.out.println("Contains 100: " + vector.contains(100));
        // 11. indexOf()
        System.out.println("Index of 20: " + vector.indexOf(20));
        // 12. lastIndexOf()
        System.out.println("Last Index of 20: " + vector.lastIndexOf(20));
        // 13. firstElement()
        System.out.println("First Element: " + vector.firstElement());
        // 14. lastElement()
        System.out.println("Last Element: " + vector.lastElement());
        // 15. remove()
        vector.remove(Integer.valueOf(40));
        System.out.println("After remove(): " + vector);
        // 16. removeElement()
        vector.removeElement(Integer.valueOf(50));
        System.out.println("After removeElement(): " + vector);
        // 17. removeElementAt()
        vector.removeElementAt(0);
        System.out.println("After removeElementAt(): " + vector);
        // 18. addAll()
        Vector<Integer> secondVector = new Vector<>();
        secondVector.add(300);
        secondVector.add(400);
        vector.addAll(secondVector);
        System.out.println("After addAll(): " + vector);

        // 19. containsAll()
        System.out.println("Contains all: " + vector.containsAll(secondVector));
        // 20. removeAll()
        vector.removeAll(secondVector);
        System.out.println("After removeAll(): " + vector);
        // 21. retainAll()
        Vector<Integer> thirdVector = new Vector<>();
        thirdVector.add(20);
        thirdVector.add(100);
        vector.retainAll(thirdVector);
        System.out.println("After retainAll(): " + vector);
        // 22. clone()
        Vector<Integer> clonedVector = (Vector<Integer>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);
        // 23. clear()
        vector.clear();
        System.out.println("After clear(): " + vector);
        // 24. isEmpty()
        System.out.println("Is Empty after clear: " + vector.isEmpty());
    }
}