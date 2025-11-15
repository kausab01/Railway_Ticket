package Pack1;

import java.util.Scanner;


public class Food {
	static
	{
		System.out.println("~WELCOME TO MAULI VADAPAV~\n");
	}
	static void menu()
	{
		System.out.println("\tMENU : \n***********************");
		System.out.println("1 Classic vadaPav  *25/-|15/-");
		System.out.println("2 Cheese vadaPav   *50/-|25/-");
		System.out.println("3 Shezwaan vadaPav *40/-|20/-");
		System.out.println("4 All mix vadaPav  *75/-|35/-");
		System.out.println("0 exit\n***********************");
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean p=true;
		int ch,cplates,splates,c1plates,aplates,total=0,gtotal=0;
		int clbill=0,chbill=0,shbill=0,abill=0;
		
while(p){
		menu();
		System.out.println("enter choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("~Classic~");
			System.out.println("1 Half / 2 full");
			System.out.println("choice :");
			ch=sc.nextInt();
			if(ch==1)
			{
			cplates=1;
			total=(cplates*15);
			clbill+=total;
			//System.out.println();
			}
			if(ch==2)
			{
				System.out.println("enter plates : ");
				cplates=sc.nextInt();
				total=(cplates*25);
				clbill+=total;
			}
			System.out.println("bill : "+total);
			break;
		case 2:
			System.out.println("~Cheesy~");
			System.out.println("1 Half / 2 full");
			System.out.println("choice :");
			ch=sc.nextInt();
			if(ch==1)
			{
			
			c1plates=1;
			total=(c1plates*25);
			chbill+=total;
			}
			if(ch==2)
			{
				System.out.println("enter plates : ");
				c1plates=sc.nextInt();
				total=(c1plates*50);
				chbill+=total;	
			}
			System.out.println("bill : "+total);
			break;
		case 3:
			System.out.println("~Shezwaan~");
			System.out.println("1 Half / 2 full");
			System.out.println("choice :");
			ch=sc.nextInt();
			if(ch==1)
			{
				splates=1;
				total=(splates*20);
				shbill+=total;
			}
			if(ch==2){
			System.out.println("enter plates : ");
			splates=sc.nextInt();
			total=(splates*40);
			shbill+=total;
			}
			System.out.println("bill : "+total);
			break;
			
		case 4:
			System.out.println("~All mix~");
			System.out.println("1 Half / 2 full");
			System.out.println("choice :");
			ch=sc.nextInt();
			if(ch==1)
			{
			  aplates=1;
			  total=(aplates*35);
			  abill+=total;
			}
			if(ch==2)
			{
				System.out.println("enter plates : ");
				aplates=sc.nextInt();
				total=(aplates*75);
				abill+=total;
			}
			System.out.println("bill : "+total);
			break;
		case 0:
			gtotal=(clbill+chbill+shbill+abill);
			System.out.println("Grand total : "+gtotal);
			System.out.println("THANK YOU !!");
			p=false;
			break;
			
		}
	
	}


/*System.out.println("\t::Your Bill::\n");
System.out.println("|item\t|Qty\t|Rate\t|sub total\t|");*/


	}

}
