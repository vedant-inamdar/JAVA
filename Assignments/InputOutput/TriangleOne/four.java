import java.io.*;
public class four{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
for(int i=1;i<=n;i++){
char ch=(char)(64+n);
char ch1=(char)(96+n);
for(int j=1;j<=i;j++){
if(i%2==0){
System.out.print(ch--+" ");
}
else{
System.out.print(ch1-- +" ");
}
}
System.out.println();
}
}
}