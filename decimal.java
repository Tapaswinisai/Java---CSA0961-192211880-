import java.util.Scanner;
class decimal{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter decimaal number");
int n=scanner.nextInt();
String binary=Integer.toBinaryString(n);
System.out.println("binary number"+binary);
}
}