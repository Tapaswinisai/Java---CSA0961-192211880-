import java.util.Scanner;
class celsius{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter temp:");
float c=scanner.nextFloat();
double f=(c*9.0)/32;
System.out.println("temp in fahrenheit: "+f);
}
}