import java.util.*;
public class five{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
char ch='A';
char ch1='a';
for(int j=i;j<=n;j++){
if(i%2!=0){
System.out.print(ch +" ");
ch++;
}
else{
System.out.print(ch1 +" ");
ch1++;
}
}
System.out.println();
}
}
}