import java.util.Scanner;
class reverseword{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter string");
String ch=scanner.nextLine();
String reverse="";
for(int i=ch.length()-1;i>=0;i--){
reverse+=ch.charAt(i);
}
System.out.println("reversed word:"+reverse);
}
}