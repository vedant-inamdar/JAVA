import java.util.*;

public class Four {
    public static int calcnum(int n) {
        int initial = 1;
        for (int i = 1; i < n; i++) {
            initial = initial + i + 1;
        }
        return initial;
    }

    public static void printchar(int n) {
        char ch = (char) (64 + calcnum(n));
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printchar(n);
    }
}
