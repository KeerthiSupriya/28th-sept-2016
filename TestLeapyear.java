import java.util.*;
import java.io.*;
public class TestLeapyear
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
Leapyear l=new Leapyear();
int c=l.countLeapYear(a,b);
System.out.println(c);
}
}


