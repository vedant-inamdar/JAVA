import java.util.*;
public class three {
public static int factorial(int n) {
if (n < 0) {
return -1;
}
int factorial = 1;
for (int i = 1; i <= n; i++) {
factorial *= i;
}
return factorial;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
int factorial = factorial(n);
System.out.print("Factorial of " + n + " is " + factorial + ".");
}
}