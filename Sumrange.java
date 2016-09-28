import java.util.*;
import java.io.*;
public class Sumrange
{
	public static void main(String args[])
	{
	int a,b;
	Scanner s=new Scanner(System.in);
    Testsumrange p=new Testsumrange();
    a=s.nextInt();
    b=s.nextInt();
    int y=p.countSum(a,b);
    System.out.println(y);
}
}
