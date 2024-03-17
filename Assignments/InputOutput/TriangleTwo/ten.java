import java.util.*;
public class seven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
char ch1=(char)(64+n-i+1);
char ch=(char)(96+n-i+1);
for(int j=1;j<=n-i+1;j++){
if(i%2==0){
System.out.print(ch +" ");
ch--;
}
else{
System.out.print(ch1 + " ");
ch1--;
}
}
System.out.println();
}
}
}