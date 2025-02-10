import java.io.*;
import java.util.*;
class Details{
	static void displayDetails(String name,int age,int marks,long salary){
		System.out.println();
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Marks : "+marks);
		System.out.println("Salary : "+salary);

}
	public static void main(String args[]){
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter your Name : ");
	String name=sc.nextLine();
	System.out.println("Enter your Age : ");
	int age=sc.nextInt();
	System.out.println("Enter your Mark : ");
	int marks=sc.nextInt();
	System.out.println("Enter your Salary : ");
	long salary=sc.nextLong();
	displayDetails(name,age,marks,salary);	
}
}