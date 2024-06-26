import java.util.Scanner;
class leap{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter year");
int year=scanner.nextInt();
if(year%4==0){
System.out.println("leap year");
}
else{
System.out.println("not leap year");
}
}
