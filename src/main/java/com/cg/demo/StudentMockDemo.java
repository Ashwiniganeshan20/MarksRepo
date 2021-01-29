package com.cg.demo;

import java.util.List;



public class StudentMockDemo {
	String name;
	List<Marks> listOfMarks;
	
	public int calculateMark()
	{
		int total = 0;
		for (Marks mark:listOfMarks) {
			total+=mark.getMark(mark.getName());
		}
		return total;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		 this.name = name;
	}
 
	public List<Marks> getListOfItems() {
		return listOfMarks;
	}
 
	public void setListOfItems(List<Marks> listOfMarks) {
		this.listOfMarks = listOfMarks;
	}	

}
