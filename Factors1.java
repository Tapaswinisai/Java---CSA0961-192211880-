class Factors1
{
	public static void main(String arg[])
	{
	int i,n,count=0;
	n=100;
	for(i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	System.out.println(i);
	count++;
	}
	}
	System.out.println("no of factors="+count);
	}
}