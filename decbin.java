import java.util.Scanner;
class decimal{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();

String decimal=Integer.toDecimalString(n);

System.out.println("decimal string"+decimal);
}
}