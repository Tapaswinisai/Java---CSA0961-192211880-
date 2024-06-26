import java.util.Scanner;
class positive{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter number");
int n=scanner.nextInt();
if(n>0){
System.out.println("postive number");
}
else if(n<0){
System.out.println("negative number");
}
else{
System.out.println("equal to zero");
}
}
}