import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
public class rns{
public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();
Random random = new Random();
for (int i = 0; i < 10; i++) {
int num = random.nextInt(10 * 5) + 10;
if (num % 2 == 0 && num % 5 == 0) {
numbers.add(num);
}
}
Collections.sort(numbers, new TensPlaceComparator());
System.out.println("Sorted ArrayList: " + numbers);
}
}
class TensPlaceComparator implements Comparator<Integer> {
public int compare(Integer num1, Integer num2) {
int tensPlace1 = (num1 / 10) % 10;
int tensPlace2 = (num2 / 10) % 10;
return Integer.compare(tensPlace1, tensPlace2);
}
}