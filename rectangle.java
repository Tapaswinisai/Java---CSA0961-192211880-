import java.util.Scanner;
class rectangle{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter length");
int l=scanner.nextInt();
System.out.println("enter breadth");
int b=scanner.nextInt();
int area=l*b;
System.out.println("area of rectangle"+area);
}
}