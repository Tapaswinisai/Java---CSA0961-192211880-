class cylinder{
int h,r;
float a;
void (int H,int R){
H=h;
R=r;
}
void cal()
{
a=2*3*14*r*(h+r);
}
void display()
{
s.o.p("area"+a);
}
PSVM(string arg[])
{
cylinder obj=new cylinder;
obj.get(10,20);
obj.cal();
obj.display();
}
}