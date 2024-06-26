import java.util.Scanner;
class special{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter string");
String str=scanner.nextLine();
int special=0;
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(!(ch>='a' && ch<='z')&&!(ch>='A' && ch<='Z')&&!(ch>='0' && ch<='9')){
special=special+1;
}
}
System.out.println("special char"+special);
}
}
