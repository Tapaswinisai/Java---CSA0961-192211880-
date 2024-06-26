import java.util.Scanner;
class stringequal{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter string1");
String str1=scanner.nextLine();
System.out.println("enter string2");
String str2=scanner.nextLine();
if(str1==str2){
System.out.println("equal");
}
else{
System.out.println("not equal");
}
}
}