import java.util.*;
class AgeChecker{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age=sc.nextInt();
		boolean res=age>18;
		System.out.println(res);
}
}