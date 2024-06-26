import java.util.Scanner;
class oddoreven{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter number");
int n=scanner.nextInt();
if(n%2==0){
System.out.println("even");
}
else{
System.out.println("odd");
}
}
}