package collections.Deque;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeCompletePractice {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // 1. add() - adds element at the rear
        deque.add(20);
        deque.add(30);
        deque.add(40);
        System.out.println("Deque: " + deque);
        // 2. addFirst() - adds element at the front
        deque.addFirst(10);
        System.out.println("After addFirst(10): " + deque);
        // 3. addLast() - adds element at the rear
        deque.addLast(50);
        System.out.println("After addLast(50): " + deque);
        // 4. offerFirst()
        deque.offerFirst(5);
        System.out.println("After offerFirst(5): " + deque);
        // 5. offerLast()
        deque.offerLast(60);
        System.out.println("After offerLast(60): " + deque);
        // 6. getFirst()
        System.out.println("First element using getFirst(): " + deque.getFirst());

        // 7. getLast()
        System.out.println("Last element using getLast(): " + deque.getLast());

        // 8. peekFirst()
        System.out.println("First element using peekFirst(): " + deque.peekFirst());
        // 9. peekLast()
        System.out.println("Last element using peekLast(): " + deque.peekLast());
        // 10. removeFirst()
        System.out.println("Removed first element: " + deque.removeFirst());
        System.out.println("After removeFirst(): " + deque);
        // 11. removeLast()
        System.out.println("Removed last element: " + deque.removeLast());
        System.out.println("After removeLast(): " + deque);
        // 12. pollFirst()
        System.out.println("Removed first using pollFirst(): " + deque.pollFirst());
        System.out.println("After pollFirst(): " + deque);

        // 13. pollLast()
        System.out.println("Removed last using pollLast(): " + deque.pollLast());
        System.out.println("After pollLast(): " + deque);
        // 14. push() - adds element at the front
        deque.push(100);
        System.out.println("After push(100): " + deque);
        // 15. pop() - removes element from the front
        System.out.println("Removed using pop(): " + deque.pop());
        System.out.println("After pop(): " + deque);
        // 16. contains()
        System.out.println("Contains 30? " + deque.contains(30));
        System.out.println("Contains 500? " + deque.contains(500));
        // 17. size()
        System.out.println("Deque size: " + deque.size());

        // 18. isEmpty()
        System.out.println("Is deque empty? " + deque.isEmpty());

        // 19. removeFirstOccurrence()
        deque.addLast(30);
        deque.addLast(30);
        System.out.println("Before removeFirstOccurrence(): " + deque);
        deque.removeFirstOccurrence(30);
        System.out.println("After removeFirstOccurrence(30): " + deque);
        // 20. removeLastOccurrence()
        deque.removeLastOccurrence(30);
        System.out.println("After removeLastOccurrence(30): " + deque);
        // 21. clear()
        deque.clear();
        System.out.println("After clear(): " + deque);
        // 22. isEmpty() after clear()
        System.out.println("Is deque empty after clear()? " + deque.isEmpty());
    }
}