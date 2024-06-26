import java.util.Scanner;
class factors{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter number");
int n=scanner.nextInt();
for(int i=1;i<=n;i++){
if(n%i==0){
System.out.println(i);
}
}
}
}