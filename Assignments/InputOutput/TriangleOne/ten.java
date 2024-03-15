import java.io.*;
public class ten{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
char ch='a';
int x = 1;
for(int i=1;i<=n;i++){

for(int j=1;j<=i;j++){
if(i%2==0){
System.out.print(ch++ +" ");
x++;
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