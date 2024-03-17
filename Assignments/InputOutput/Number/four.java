import java.util.*;
public class four {
public static int reverse(int n) {
int reversedNumber = 0;
while (n != 0) {
int digit = n % 10;
reversedNumber = reversedNumber * 10 + digit;
n /= 10;
}
return reversedNumber;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
int result = reverse(n);
System.out.print("Reverse of " + n + " is " + result + ".");
}
}