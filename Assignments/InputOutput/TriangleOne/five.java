import java.io.*;
public class five{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
char ch=(char)(64+n);
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(ch++ +" ");
}
System.out.println();
}
}
}