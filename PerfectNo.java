package exercise23july19;

import java.util.Scanner;

public class PerfectNo {
	int [] number = new int[5];
	int [] perfect = new int[5];
	//private int i, n,sum=0;
	int i;
	Scanner scan = new Scanner(System.in);
	public void getInput()
	{
		System.out.println("Enter n value");
		for(i=0;i<5;i++)
		{
		number[i]=scan.nextInt();
		}
	}
public void perfectNo()
{
	for(int j=0;j<5;j++)
	{
	//int temp=n;
		int sum=0;
	for(i=1;i<number[j];i++)
	{
		if(number[j]%i==0)
		{
		sum=sum+i;
		}
	}
	perfect[j]=sum;
	}
}
		//System.out.println("N is "+n);
		//System.out.println("Sum is "+sum);
	public void check()
	{
		for(i=0;i<5;i++)
		{
	if(number[i]==perfect[i])
	{
		System.out.println( number[i] + " is a Perfect Number");
	}
	else
	{
		System.out.println(number[i] + " is Not a perfect number");
	}
		}
}
}
