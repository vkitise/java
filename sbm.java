public class sbm{
public static void main(String[] args) {
StringBuffer sb = new StringBuffer("Hello World!");
System.out.println("Length: " + sb.length());
System.out.println("Capacity: " + sb.capacity());
sb.setLength(10);
System.out.println("Set length to 10: " + sb);
sb.ensureCapacity(20);
System.out.println("Ensure capacity of 20: " + sb.capacity());
sb.insert(5, " Java");
System.out.println("Insert ' Java' at index 5: " + sb);
sb.delete(5, 10);
System.out.println("Delete from index 5 to 10: " + sb);
sb.reverse();
System.out.println("Reverse: " + sb);
sb.append(" and goodbye");
System.out.println("Append ' and goodbye': " + sb);
sb.insert(0, "Hello ");
System.out.println("Insert 'Hello ' at index 0: " + sb);
sb.deleteCharAt(5);
System.out.println("Delete char at index 5: " + sb);
sb.replace(0, 5, "Hi");
System.out.println("Replace 'Hello ' with 'Hi': " + sb);
}
}