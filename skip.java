import java.util.Scanner;
class skip{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int m=scanner.nextInt();
int n=scanner.nextInt();
int k=scanner.nextInt();
for(int i=m;i<=n;i+=k+1){
}

System.out.println(m,n,k);
}
}