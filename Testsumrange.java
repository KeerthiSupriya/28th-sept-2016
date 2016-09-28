public class Testsumrange
{
	int i;
	int a,b;
public int countSum(int a,int b)
{
	int sum=0;
for(i=a;i<=b;i++)
{
if(i%13==0||i%15==0||i%17==0)
{
	if(i%30!=0)
	{
sum=sum+i;
}
}
}
return sum;
}
}
