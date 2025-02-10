import java.io.*;
import java.util.*;
class Rectangle
{
	static void areaOfRectangle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height of the Rectangle : ");
		int height=sc.nextInt();
		System.out.println("Enter the Breadth of the Rectangle : ");
		int breadth=sc.nextInt();
		System.out.println("Area of Rectangle is : "+height*breadth);

}
public static void main(String[] ar)
{
areaOfRectangle();
}
}