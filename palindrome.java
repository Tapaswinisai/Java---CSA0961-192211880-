import java.util.Scanner;
class palindrome{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter number");
int n=scanner.nextInt();
int rem,rev=0;
int org=n;
while(n!=0){
rem=n%10;
rev=rev*10+rem;
n=n/10;
}

if(rev == org){
System.out.println("palindrome");
}
else{
System.out.println("not palindrome");
}
}
}