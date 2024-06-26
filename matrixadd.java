import java.util.Scanner;
class matrixadd{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("matrix1");
int a[][]=new int[10][10];
int r1=scanner.nextInt();
int c1=scanner.nextInt();
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
a[i][j]=scanner.nextInt();
}
}
System.out.println("matrix2");
int b[][]=new int[10][10];

for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
b[i][j]=scanner.nextInt();
}
}
int c[][]=new int[10][10];
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
c[i][j]=a[i][j]+b[i][j];
}
}
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
System.out.println(c[i][j]+" ");
}
}
}
}