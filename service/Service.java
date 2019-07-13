package com.service;

import java.util.HashMap;

import com.bean.Bean;
import com.dao.Dao;

public class Service 
{	Dao d;
	Bean b;
	
	public Service()
	{
		 d = new Dao();
		 b = new Bean();
	}
	public void service(Bean b)
	{
	
	  Bean be = calGrade(b);
	  
	  System.out.println("details accepted");
	  d.dao(be);
	}
	
	
	public Bean calGrade(Bean b)
	{
		System.out.println("details accepted before cal");
		int cal = b.getPrice();
        char finalgrade;
		if(cal <1000)
		{
			finalgrade = 'A';
		}
		else
			finalgrade = 'B';
		b.setGrade(finalgrade);
		return b;
		
	}


	public void retrive(int id) 
	{
		if(d.retrive().containsKey(id))
		{
			b = (Bean) d.retrive().get(id);
		    
			System.out.println(b.getName());
			System.out.print(b.getName()+b.getId()+b.getPrice()+b.getGrade());
		}
		else
			System.out.println("noo");
		
	}
	
	
}

