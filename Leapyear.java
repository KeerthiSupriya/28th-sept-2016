public class Leapyear
{
	int a,b;
public int countLeapYear(int a,int b)
{
	int sum=0;
for(int i=a;i<=b;i++)
{
if((i%4==0&&i%100!=0||i%400==0))
{
sum++;
}
}
return sum;
}
}
