import java.util.Scanner;
class righttriangle{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter rows r:");
int r=scanner.nextInt();
for(int i=1;i<=r;i++){
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println();
}
}
}
