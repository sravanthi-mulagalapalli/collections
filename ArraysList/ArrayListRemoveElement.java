package collections.ArraysList;
import java.util.ArrayList;
public class ArrayListRemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(Integer.valueOf(30));
        System.out.println(list);
    }
}