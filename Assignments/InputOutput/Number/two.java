import java.util.*;
public class two {
public static boolean isPrime(int n) {
if (n <= 1)
return false;
for (int i = 2; i < n; i++)
if (n % i == 0) {
return true;
}
return false;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
boolean result = isPrime(n);
if (result) {
System.out.println(n + " is a composite number");
}
else {
System.out.println(n + " is not a composite number");
}
}
}