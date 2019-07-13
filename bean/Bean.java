package com.bean;

public class Bean 
{
	String name;
	int id;
	int price;
	char grade;
	int vehicleid;
	
	public Bean(String name2, int id2, int price2,int dup2) 
	{
		name = name2;
		id = id2;
		price = price2;
		vehicleid = dup2; 
	}



	public Bean() {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	

	public int getVehicleid() {
		return vehicleid;
	}



	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}



	@Override
	public String toString() {
		return "Bean [name=" + name + ", id=" + id + ", price=" + price + ", grade=" + grade + ", vehicleid="
				+ vehicleid + "]";
	}





/*	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", price=" + price + ", grade=" + grade ;
	}
	*/
	
	
	
	
}
