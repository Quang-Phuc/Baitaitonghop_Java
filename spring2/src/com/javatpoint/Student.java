package com.javatpoint;

public class Student {
private String name;
private String tuoi;

public String getTuoi() {
	return tuoi;
}

public void setTuoi(String tuoi) {
	this.tuoi = tuoi;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void displayInfo(){
	System.out.println("Hello: "+name);
}
public void hienthi()
{
	System.out.println("Tuoi ban la :"+tuoi);
	}
}
