import java.util.*;
public class three{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=n*(n+1);
for(int i=1;i<=n;i++){
for(int j=i;j<=n;j++){
System.out.print(num+"  ");
num=num-2;
}
System.out.println();
}
}
}