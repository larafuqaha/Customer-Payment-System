/*
 Name: Lara Fuqaha
 ID: 1220071
 lab section: 10
 lecture section: 6
 */
package assignment1;
import java.util.*;
public class My_class {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2,num3,num4,option;
		System.out.println("Enter four different integers:");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		num4=input.nextInt();
		do
		{
			System.out.println("Choose the action required:");
			System.out.println("1- Print max integer");
			System.out.println("2- Print min integer");
			System.out.println("3- Print integers arranged in ascending order");
			System.out.println("4- Print integers reversed");
			System.out.println("5- Exit");
			option=input.nextInt();
			switch (option)
			{	
			case 1: System.out.println("Max integer = "+getMax(num1,num2,num3,num4));
			break;
			case 2: System.out.println("Min integer = "+getMin(num1,num2,num3,num4));
			break;
			case 3: printArrangedNumbers(num1,num2,num3,num4);
			break;
			case 4: printReversedNumbers(num1,num2,num3,num4);
			break;
			case 5: System.out.println("Thank you for using my program, goodbye.");
			break;
			default: System.out.println("No such option"); 
			}
			
		} 
		while (option!=5);
	}
	public static int getMax (int num1,int num2,int num3, int num4)
	{
		int max=num1;
		if(num2>max)
			max=num2;
		if(num3>max)
			max=num3;
		if(num4>max)
			max=num4;
		return max;
	}
	public static int getMin (int num1, int num2, int num3, int num4)
	{
		int min=num1;
		if(num2<min)
			min=num2;
		if(num3<min)
			min=num3;
		if(num4<min)
			min=num4;
		return min;
	}
	public static void printArrangedNumbers (int num1,int num2,int num3,int num4)
	{	int a;
		if(num1>num2)
		{
			a=num1;
			num1=num2;
			num2=a;
		}
		int b;
		if(num1>num3)
		{
			b=num1;
			num1=num3;
			num3=b;
		}
		int c;
		if(num1>num4)
		{
			c=num1;
			num1=num4;
			num4=c;
		}
		int d;
		if(num2>num3)
		{
			d=num2;
			num2=num3;
			num3=d;
		}
		int e;
		if(num2>num4)
		{
			e=num2;
			num2=num4;
			num4=e;
		}
		int f;
		if(num3>num4)
		{
			f=num3;
			num3=num4;
			num4=f;
		}
		System.out.println("The integers arranged in ascending order: "+num1+" " +num2+" " +num3+" " +num4);
	}
	public static void printReversedNumbers (int num1,int num2,int num3,int num4)
	{
		int reverse1=0,reverse2=0,reverse3=0,reverse4=0;
		while(num1!=0)
		{
			int remainder=num1%10;
			reverse1=reverse1*10 + remainder;
			num1=num1/10;
		}
		while(num2!=0)
		{
			int remainder=num2%10;
			reverse2=reverse2*10 + remainder;
			num2=num2/10;
		}
		while(num3!=0)
		{
			int remainder=num3%10;
			reverse3=reverse3*10 + remainder;
			num3=num3/10;
		}
		while(num4!=0)
		{
			int remainder=num4%10;
			reverse4=reverse4*10 + remainder;
			num4=num4/10;
		}
		System.out.println("The reversed integers: "+reverse1+" "+reverse2+" "+reverse3+" "+reverse4);		
	}

}
