import java.util.Scanner;
class sphere{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter radius");
int r=scanner.nextInt();
double volume=1.3*3.14*r*r*r;
System.out.println("volume of sphere"+volume);
}
}