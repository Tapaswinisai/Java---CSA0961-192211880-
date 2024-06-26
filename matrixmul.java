import java.util.Scanner;
class matrixmul{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter matrix1");
int a[][]=new int[10][10];
int r1=scanner.nextInt();
int c1=scanner.nextInt();
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
a[i][j]=scanner.nextInt();
}
}
int b[][]=new int[10][10];
System.out.print("enter matrix2");
int r2=scanner.nextInt();
int c2=scanner.nextInt();
for(int i=0;i<r2;i++){
for(int j=0;j<c2;j++){
b[i][j]=scanner.nextInt();
}
}
int c[][]=new int[10][10];
for(int i=0;i<r1;i++){
for(int j=0;j<c2;j++){
c[i][j]=0;
for(int k=0;k<c1;k++){
c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j]+" ");
}
}
}
}