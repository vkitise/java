class Stack {
int top = -1;
int capacity = 20;
int[] a = new int[capacity];
void push(int x) {
if (top == capacity - 1) {
System.out.println("Stack is overflow");
System.exit(1);
}
System.out.println("Inserted element=" + x);
a[++top] = x;
}
int pop() {
if (top == -1) {
System.out.println("Stack is empty");
System.exit(1);
}
return a[top--];
}
public static void main(String[] args) {
Stack s = new Stack();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
s.push(50);
s.push(60);
System.out.println("Popped Element: " + s.pop());
System.out.print("Remaining stack elements: ");
for (int i = 0; i <= s.top; i++) {
System.out.print(s.a[i] + " ");
}
}
}
