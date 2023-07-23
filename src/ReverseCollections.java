import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class ReverseCollections {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");


        System.out.println("Elements of the ArrayList in reverse order:");
        Collections.reverse(arrayList);
        for (Integer num : arrayList) {
            System.out.println(num);
        }


        System.out.println("\nElements of the LinkedList in reverse order:");
        Collections.reverse(linkedList);
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
