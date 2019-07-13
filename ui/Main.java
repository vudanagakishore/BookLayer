package com.ui;

import java.util.*;

public class Main 
{
	public static void main(String [] args)
	{
		Scanner keyboard=new Scanner(System.in);
		BookRecord b = new BookRecord();
		while(true)
		{
			System.out.println("Specify your choice:1.add 2.ss 3.exit");
			int choice = keyboard.nextInt();
			
			switch(choice)
			{
			case 1:
				b.addBook();
				break;
			case 2:
				//System.out.println(":");
				b.retrive();
				break;
				default:
					System.exit(0);
			}
		}
		
	}
}
