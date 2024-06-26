import java.util.Scanner;
class p1{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter base");
int b=scanner.nextInt();
System.out.print("enter height");
int h=scanner.nextInt();
double area=0.5*b*h;
System.out.println("area of triangle"+area);
}
}