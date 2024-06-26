import java.util.Scanner;
class factorial{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter number");
int n=scanner.nextInt();
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("factorial of number is:"+fact);
}
}