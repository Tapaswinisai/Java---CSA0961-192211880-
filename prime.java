import java.util.Scanner;
class prime{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter number n:");
int n=scanner.nextInt();
int c=0;
for(int i=2;i<=10;i++){
if(n%i==0){
c=c+1;
}
}
if(c>1){
System.out.print("composite");
}else{
System.out.print("prime");
}
}
}