import java.io.*;
public class six{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
char ch='A';
for(int i=1;i<=n;i++){
int x = 1;
for(int j=1;j<=i;j++){
if(i%2==0){
System.out.print(ch++ +" ");
}
else{
System.out.print(x++ +" ");
ch++;
}
}
System.out.println();
}
}
}