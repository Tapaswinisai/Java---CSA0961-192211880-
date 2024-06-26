import java.util.Scanner;
class circle{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter radius r:");
double r=scanner.nextdouble();
double area=3.14*r*r;
System.out.println("area of circle:"+area);
scanner.close();
}
}