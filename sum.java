import java.util.Scanner;
class sum{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter n");
int n=scanner.nextInt();
int sum=0;
for(int i=1;i<=n;i++){
sum=sum+i;
}
System.out.println("sum is:"+sum);
}
}
