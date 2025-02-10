import java.io.*;
import java.util.*;
class Rectangle {
	static void areaOfTriangle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height of the Triangle : ");
		int height=sc.nextInt();
		System.out.println("Enter the Base of the Tringle : ");
		int base=sc.nextInt();
		float area=0.5f*height*base;
		System.out.println("Area of Triangle is : "+area);

}
	public static void main(String[] ar){
		areaOfTriangle();
}
}