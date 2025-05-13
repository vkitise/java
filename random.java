import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class random{
public static void main(String[] args) {
int min = 1;
int max = 100;
List<Integer> numbers = new ArrayList<>();
Random random = new Random();
for (int i = 0; i < 20; i++) {
int num = random.nextInt(max - min + 1) + min;
if (num % 2 == 0 && num % 5 == 0) {
numbers.add(num);
}
}
Collections.sort(numbers, new TensPlaceComparator());
System.out.println("Sorted list: " + numbers);
}
}
class TensPlaceComparator implements java.util.Comparator<Integer> {
public int compare(Integer num1, Integer num2) {
int tensPlace1 = (num1 / 10) % 10;
int tensPlace2 = (num2 / 10) % 10;
return Integer.compare(tensPlace1, tensPlace2);
}
}