import java.util.*;
public class five {
public static boolean isPalindrome(int n) {
int original = n;
int reversed = 0;
while (n != 0) {
int digit = n % 10;
reversed = reversed * 10 + digit;
n /= 10;
}
return original == reversed;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
boolean isPalindrome = isPalindrome(n);
if (isPalindrome) {
System.out.println(n + " is a palindrome number.");
} else {
System.out.println(n + " is not a palindrome number.");
}
}
}