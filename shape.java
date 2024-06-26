class shape
{
int r,h,l;
float as,vs,ac,vc,acy,vcy;
double a=3.14;
void get(int R,int H,int L){
R=r;
H=h;
L=l;
}
void cal()
{
as=4*a*r*r;
vs=4/3*a*r*r*r;
ac=a*r*(l+r);
vc=1/3*a*r*r*h;
acy=2*a*r*(h+r);
vcy=a*r*r*h;
}
void display(){
System.out.println("area of sphere"+as);
System.out.println("volume of sphere"+vs);
System.out.println("area of cone"+ac);
System.out.println("volume of cone"+vc);
System.out.println("area of cylinder"+acy);
System.out.println("volume of cylinder"+vcy);
}
public static void main(String arg[]){
shape obj=new shape();
obj.get(4,5,6);
obj.cal();
obj.display();
}
}