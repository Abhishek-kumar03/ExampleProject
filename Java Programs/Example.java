import java.io.*;
import java.util.*;
class Example{
	static void square(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		System.out.println("Square of "+num+" is : "+num*num);

}
	static void areaOfRectangle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height of the Rectangle : ");
		int height=sc.nextInt();
		System.out.println("Enter the Breadth of the Rectangle : ");
		int breadth=sc.nextInt();
		System.out.println("Area of Rectangle is : "+height*breadth);

}
	static void areaOfCircle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle : ");
		int radius=sc.nextInt();
		float area=3.14f*radius*radius;
		System.out.println("Area of Circle is : "+area);

}
	static void areaOfTriangle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height of the Triangle : ");
		int height=sc.nextInt();
		System.out.println("Enter the Base of the Tringle : ");
		int base=sc.nextInt();
		float area=0.5f*height*base;
		System.out.println("Area of Triangle is : "+area);

}
	public static void main(String args[]){
		square();
		areaOfRectangle();
		areaOfCircle();
		areaOfTriangle();
}
}