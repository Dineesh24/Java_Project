package devop;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the A value");
			a=sc.nextInt();
			System.out.println("enter the B value");
			b=sc.nextInt();
			System.out.println("enter the C value");
			c=sc.nextInt();
		}
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is big");
			}
			else
			{
				System.out.println("C is big");
			}
		}
		else
	    {
			if(b>c)
			{
				System.out.println("b is big");
			
			}
			else 
			{
				System.out.println("c is big");
			}
		
			
				
		
		

	}

	}}

