import java.util.Scanner;
class pattren3{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter rows");
int r=scanner.nextInt();
for(int i=1;i<=r;i++){
for(int j=r;j>=i;j--){
System.out.print(" ");
}
for(int j=0;j<=2*(i-1);j++){
System.out.print(i);
}
System.out.println();
}
}
}