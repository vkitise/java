import java.util.ArrayList;
import java.util.List;
class Employee {
private String name;
private int age;
public Employee(String name, int age) {
this.name = name;
this.age = age;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String toString() {
return "Employee{" +
"name='" + name + '\'' +
", age=" + age +
'}';
}
}
public class CE {
public static void main(String[] args) {
List<Employee> employees = new ArrayList<>();
employees.add(new Employee("John Doe", 30));
employees.add(new Employee("Jane Doe", 28));
employees.add(new Employee("Alice Smith", 34));
System.out.println("Employees: " + employees);
Employee employee = employees.get(1);
System.out.println("Accessing second employee: " + employee);
employee.setAge(29);
System.out.println("ArrayList after changing age of second employee: " + employees);
employees.remove(2);
System.out.println("ArrayList after removing third employee: " + employees);
System.out.println("ArrayList size: " + employees.size());
}
}