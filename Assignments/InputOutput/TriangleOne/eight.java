import java.io.*;
public class eight{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
char ch='a';
for(int i=1;i<=n;i++){

for(int j=1;j<=i;j++){
if(j%2==0){
System.out.print(ch++ +" ");
}
else{
System.out.print(j +" ");
ch++;
}
}
System.out.println();
}
}
}