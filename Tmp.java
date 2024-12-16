class MyPoint {
private int x, y;
MyPoint() {
this.x = 0;
this.y = 0;
}
MyPoint(int x, int y) {
this.x = x;
this.y = y;
}
void setxy(int x, int y) {
this.x = x;
this.y = y;
}
int[] getxy() {
int[] coordinates = {x, y};
return coordinates;
}
public String toString() {
return "(" + x + "," + y + ")";
}
double distance(int x, int y) {
int diffx = this.x - x;
int diffy = this.y - y;
return Math.sqrt(diffx * diffx + diffy * diffy);
}
double distance(MyPoint another) {
return distance(another.x, another.y);
}
double distance() {
return distance(0, 0);
}
}
class Tmp{
public static void main(String args[]) {
MyPoint Point1 = new MyPoint();
MyPoint Point2 = new MyPoint(1, 2);
Point1.setxy(3, 4);
System.out.println("Point 1: " + Point1);
System.out.println("Point 2: " + Point2.getxy()[0] + ", " + Point2.getxy()[1]);
System.out.println("Distance between Point 1 and Point 2: " + Point1.distance(Point2));
System.out.println("Distance between Point 1 and origin(0,0): " + Point1.distance());
}
}
