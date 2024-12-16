import java.util.Scanner;
class 1{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of matrices (n):");
int n = sc.nextInt();
int i, j;
int A[][] = new int[n][n];
int B[][] = new int[n][n];
int C[][] = new int[n][n];
System.out.println("Enter the elements into matrix A:");
for (i = 0; i < n; i++) {
for (j = 0; j < n; j++) {
A[i][j] = sc.nextInt();
}
}
System.out.println("Enter the elements into matrix B:");
for (i = 0; i < n; i++) {
for (j = 0; j < n; j++) {
B[i][j] = sc.nextInt();
}
}
for (i = 0; i < n; i++) {
for (j = 0; j < n; j++) {
C[i][j] = A[i][j] + B[i][j];
}
}
System.out.println("Elements of matrix C:");
for (i = 0; i < n; i++) {
for (j = 0; j < n; j++) {
System.out.print(C[i][j] + " ");
}
System.out.println();
}
}
}
