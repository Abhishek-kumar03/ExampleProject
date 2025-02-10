import java.io.*;
import java.util.Scanner;
import java.util.*;
class PrintExample4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter True or False : ");
		boolean status=sc.nextBoolean();
		System.out.println(status);
		System.out.print("Enter a Byte Value : ");
		byte bvalue=sc.nextByte();
		System.out.println(bvalue);
		System.out.print("Enter a Long Value : ");
		long lvalue=sc.nextLong();
		System.out.println(lvalue);
		System.out.print("Enter Your Name : ");
		String name=sc.nextLine();
		name=sc.nextLine();
		System.out.println(name);
		System.out.print("Enter the Marks : ");
		float marks=sc.nextFloat();
		System.out.println(marks);
		System.out.print("Enter Grade: ");
		char grade=sc.next().charAt(0);
		System.out.println(grade);
}
}