// Create an ArrayList<Integer> and add the following elements:
// 10, 20, 30, 40, 50
// Then print all the elements using a for-each loop.
 package collections.ArraysList;
import java.util.ArrayList;
public class ArrayListAddAndPrint {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}