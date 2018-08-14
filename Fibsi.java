/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int i, n,first=0,next=1,sum;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
for(i=0;i<n;i++)
{

sum=first+next;
first=next;
next=sum;
System.out.print(first);
}
	
}

}
	
