import java.util.Scanner;
class evensum{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter number");
int n=scanner.nextInt();
int even=0,odd=0;
for(int i=1;i<=n;i++){
if(i%2==0){
even=even+i;
}
else{
odd=odd+i;
}
}
System.out.println("even sum"+even);
System.out.println("odd sum"+odd);
}
}

