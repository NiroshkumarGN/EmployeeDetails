package anudip;

import java.util.Scanner;

// Get details about Employee .. 


public class EmployeeDetails {
	public String name;
	public int age;
	public String color;
	private String gender;
	

	

	//Constructor Declared
	
	public EmployeeDetails (String name, String gender,int age, String color ) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.color=color;
	}
	// getter setter Method
	public String getName(){
		return name;
	}
	public String getGender() {
		return gender;
	}
		
	public int getAge() {
		return age;
	}
	public String getcolor() {
		return color;
	}
	@Override
	public String toString(){
		return("Hi my name is "+ this.getName()+"\nMy gender,age and color are:"+ this.getGender()+","+this.getAge()+","+this.getcolor());
	
	}
	
	
	// scanner class
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter your Gender");
		String gender = sc.next();
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		System.out.println("Enter your color");
		String color = sc.next();
		EmployeeDetails obj = new EmployeeDetails(name, gender, age, color);
		System.out.println(obj.toString());
	}
	
} 




