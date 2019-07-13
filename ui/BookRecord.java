package com.ui;

import java.util.*;

import com.bean.Bean;
import com.service.Service;

public class BookRecord 
{
	Scanner s;
	Bean b;
	Service se;
	int a = 123456789;
	public BookRecord()
	{
		se =new Service();
	}
	
	
	public void addBook()
	{
		s = new Scanner(System.in);
		System.out.println("name");
		String name = s.nextLine(); //bookname
		System.out.println("id");
		int id = s.nextInt(); //bookid;
		System.out.println("price");
		int price  = s.nextInt();
		System.out.println("details accepted");
		int vehicleid = (int)(Math.random()*34531);
		System.out.println("id is:"+vehicleid);
		System.out.println("details accepted");
		b = new Bean(name,id,price,vehicleid);
		se.service(b);
	}
	public void retrive() 
	{
		s = new Scanner(System.in);
		System.out.println("id");
		int id = s.nextInt(); //bookid;
		//se =new Service();
		se.retrive(id);
		
		
	}
}
