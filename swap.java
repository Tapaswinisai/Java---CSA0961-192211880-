import java.util.Scanner;
class swap{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter a:");
int a=scanner.nextInt();
System.out.print("enter b:");
int b=scanner.nextInt();
int temp=a;
a=b;
b=temp;
System.out.println("after swapping a:"+a);
System.out.println("after swapping b:"+b);
}
}