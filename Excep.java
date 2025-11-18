package Pack1;

import java.util.Scanner;

class Age extends Exception
{
	Age(String msg )
	{
		super(msg);
	}
}


class Demo 
{
	void cheakage(int age) throws Age
	{
		
		if (age>18)
		{
			System.out.println("valid ");
		}
		else
		{
	      throw new Age("error: age is not valid for this user ");
		}
	}
}

public class Excep {

	public static void main(String[] args) throws Age  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age : ");
		int a=sc.nextInt();
		Demo d=new Demo();
		d.cheakage(a);

	}

}
