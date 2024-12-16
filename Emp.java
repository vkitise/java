import java.util.Scanner;
class Employee {
int id;
String name;
float salary;
float raiseSalary(float percent) {
return salary + (salary * (percent / 100));
}
}
public class Emp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Employee e = new Employee();
e.id = 1;
e.name = "MNS";
e.salary = 90000;
System.out.print("Enter the percentage increment: ");
float percent = sc.nextFloat();
System.out.println("Salary after Increment = " + e.raiseSalary(percent));
}
}
