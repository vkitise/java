
abstract class Shape {
abstract double calculateArea();
abstract double calculatePerimeter();
}
class Circle extends Shape {
double radius = 5;
double calculateArea() {
return 3.14 * radius * radius;
}
double calculatePerimeter() {
return 2 * 3.14 * radius;
}
}
class Triangle extends Shape {
double a = 3, b = 4, c = 5;
double calculateArea() {
double s = (a + b + c) / 2;
return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}
double calculatePerimeter() {
return a + b + c;
}
}
class Program {
public static void main(String[] args) {
Circle C = new Circle();
Triangle T = new Triangle();
System.out.println("Area of the circle is: " + C.calculateArea());
System.out.println("Perimeter of the circle is: " + C.calculatePerimeter());
System.out.println("Area of the triangle is: " + T.calculateArea());
System.out.println("Perimeter of the triangle is: " + T.calculatePerimeter());
}
}
