import java.io.*;
import java.util.*;
class AdditionOfTwoNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b,result;
		System.out.print("Enter the First Number : ");
		a=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Second Number : ");
		b=sc.nextInt();
		result=a+b;
		System.out.println();
		System.out.println("Result : "+result);
}
}