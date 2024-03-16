import java.util.*;
public class foursecond{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++){
sum=sum+i;
}
char ch=(char)(64+sum);
for(int i=1;i<=n;i++){
for(int j=i;j<=n;j++){
System.out.print(ch-- +" ");
}
System.out.println();
}
}
}