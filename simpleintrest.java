import java.util.Scanner;
class simpleintrest{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter principle amount");
int p=scanner.nextInt();
System.out.print("enter rate of intrest");
float r=scanner.nextFloat();
System.out.print("enter duration");
int t=scanner.nextInt();
double intrest=(p*r*t)/100;
System.out.println("simple intrest"+intrest);
}
}