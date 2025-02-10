import java.io.*;
import java.util.*;
class SubtractionOfTwoNumbers{
	static int sub(int num1,int num2){
		return num1-num2;

}
	public static void main(String args[]){
	Scanner sc = new  Scanner(System.in);
	int res = sub(sc.nextInt(),sc.nextInt());
	System.out.println(res);
	int res2=sub(sc.nextInt(),sc.nextInt());
	System.out.println(res2);
	int res3 = sub(sc.nextInt(),sc.nextInt());
	System.out.println(res3);

		
}
}
