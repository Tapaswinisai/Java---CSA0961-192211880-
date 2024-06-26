import java.util.Scanner;
class p2{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter multiplication table");
int m=scanner.nextInt();
for(int i=1;i<=10;i++){
System.out.println(m+"x"+i+"="+m*i);
}
}
}