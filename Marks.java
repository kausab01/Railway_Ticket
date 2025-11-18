package Pack1;

import java.util.Scanner;
//student marksheet 
public class Marks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int student=3,subject=3;
		
		int[][] marks=new int[student][subject];
		String[] name=new String[student];
		
	
		for(int i=0;i<student;i++)
		{
			System.out.println("enter student "+(i+1)+" name : ");
			name[i]=s.nextLine();
			
			for(int j=0;j<student;j++)
			{
				System.out.println("enter marks "+(j+1)+" : ");
				marks[i][j]=Integer.parseInt(s.nextLine());
			}
			
		}
		System.out.println();
		
		System.out.println("\n📋 Student Marks Report:");
        System.out.println("---------------------------------------------");
        System.out.printf("%-10s  %5s  %5s  %5s  %8s  %10s\n", "Name", "Sub1", "Sub2", "Sub3", "Total", "Percentage");
        System.out.println("---------------------------------------------");
		
        
        for(int i=0;i<student;i++)
        {
        	int total=0;
        	for(int j=0;j<subject;j++)
        	{
        		total+=marks[i][j];
        	
        	}
        	double percentage = total / (double)subject;
        	System.out.printf("%-10s  %5s  %5s  %5s  %8s  %2s\n",name[i],marks[i][0],marks[i][1],marks[i][2],total,percentage);
        
        		
        	
        }
        System.out.println("-------------------------------------------------");

	}

}
