package collections.Queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueCompletePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // 1. add() - adds elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Queue: " + queue);
        // 2. offer() - adds an element to the queue
        queue.offer(50);
        System.out.println("Queue after offer(50): " + queue);
        // 3. peek() - returns the front element without removing
        System.out.println("Front element using peek(): " + queue.peek());
        // 4. element() - returns the front element
        System.out.println("Front element using element(): " + queue.element());
        // 5. poll() - removes and returns the front element
        System.out.println("Removed element using poll(): " + queue.poll());
        System.out.println("Queue after poll(): " + queue);
        // 6. remove() - removes and returns the front element
        System.out.println("Removed element using remove(): " + queue.remove());
        System.out.println("Queue after remove(): " + queue);
        // 7. contains()
        System.out.println("Contains 30? " + queue.contains(30));
        System.out.println("Contains 100? " + queue.contains(100));
        // 8. size()
        System.out.println("Queue size: " + queue.size());
        // 9. isEmpty()
        System.out.println("Is queue empty? " + queue.isEmpty());
        // 10. addAll()
        Queue<Integer> secondQueue = new LinkedList<>();
        secondQueue.add(60);
        secondQueue.add(70);
        queue.addAll(secondQueue);
        System.out.println("Queue after addAll(): " + queue);
        // 11. remove(Object)
        queue.remove(Integer.valueOf(30));
        System.out.println("Queue after removing 30: " + queue);
        // 12. clear()
        queue.clear();
        System.out.println("Queue after clear(): " + queue);
        // 13. Checking empty queue
        System.out.println("Is queue empty after clear()? " + queue.isEmpty());
    }
}