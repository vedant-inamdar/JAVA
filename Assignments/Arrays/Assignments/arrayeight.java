import java.util.*;
public class arrayeight{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
}
}