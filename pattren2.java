import java.util.Scanner;
class pattren2{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter rows");
int r=scanner.nextInt();
for(int i=r;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println();
}
}
}