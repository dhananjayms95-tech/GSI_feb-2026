package day1;
import java.util.Scanner;
public class Program6_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* float marks = 87.6F;
		double doublemarks = marks;
		int intvalue = (int)marks;
		char charvalue = (char)intvalue;
		 
		System.out.println ("Float value : " + marks);
		System.out.println ("double value : " + doublemarks);
		System.out.println("Integer value : " + intvalue);
		System.out.println("ASCII Value is : " + charvalue);  */  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char input = sc.next().charAt(0);
		
		int ascivalue = (int)input;
		System.out.println("ASCII Value : " + ascivalue);
		 
		 // add 5 to ascii value 
		int newvalue = ascivalue + 5;
		System.out.println("New ASCII value : " + newvalue);
		
		 // conver to the char value 
		
		char newchar = (char)newvalue;
		System.out.println("New character : " + newchar);
		
				
		
		
		
		
		
		

	}

}
