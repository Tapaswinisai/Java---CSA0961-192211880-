import java.util.Scanner;
class sumofele{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter size:");
int n=scanner.nextInt();
int sum=0;
int a[]=new int[100];
for(int i=0;i<n;i++){
a[i]=scanner.nextInt();
}
for(int i=0;i<n;i++){
sum=sum+a[i];
}
System.out.println("sum of elemnts"+sum);
}
}
