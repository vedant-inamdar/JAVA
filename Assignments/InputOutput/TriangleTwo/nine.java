import java.util.*;
public class nine{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=n*(n+1)-1;
for(int i=1;i<=n;i++){
for(int j=1;j<=n-i+1;j++){
System.out.print(x + " ");
x=x-2;
}
System.out.println();
}
}
}