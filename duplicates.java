import java.util.Scanner;
class duplicates{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in){
System.out.println("enter size");
int n=scanner.nextInt();
int a[]=new int[20];
for(int i=1;i<=n;i++){
a[i]=scanner.nextInt();
}
int[] unique=removeDuplicates(a);
System.out.println("new array"+ Arrays.toString(unique));
}
}