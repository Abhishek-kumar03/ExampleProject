import java.io.*;
import java.util.*;
class AverageOfFourNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3,num4;
		float result;
		System.out.print("Enter the First Number : ");
		num1=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Second Number : ");
		num2=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Third Number : ");
		num3=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Fourth Number : ");
		num3=sc.nextInt();
		result=(float)(num1+num2+num3+num4)/4;
		System.out.println();
		System.out.println("Result : "+result);
}
}