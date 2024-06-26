import java.util.Scanner;
class quorem{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter a:");
int a=scanner.nextInt();
System.out.println("enter b");
int b=scanner.nextInt();
double quotient=a/b;
int remainder=a%b;
System.out.println("quotient"+quotient);
System.out.println("remainder"+remainder);
}
}