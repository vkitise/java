import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class array{
public static void main(String[] args) {
ArrayList<Integer> arrayList = new ArrayList<>();
arrayList.add(5);
arrayList.add(2);
arrayList.add(8);
arrayList.add(1);
arrayList.add(9);
System.out.println("Initial ArrayList: " + arrayList);
arrayList.remove(2);
System.out.println("ArrayList after removing an element: " + arrayList);
Collections.sort(arrayList);
System.out.println("Sorted ArrayList: " + arrayList);
Integer[] array = arrayList.toArray(new Integer[0]);
System.out.println("Array: " + Arrays.toString(array));
} 
}