package com.test;

public class NamePatternTest1 {

	public static void main(String[] args) 
	{
		for (int x = 1; x <= 5; x++) 
		{
			for (int y = 1; y <= x; y++) 
			{
			System.out.print(" " +y);
			}
		System.out.println("Numbers are");
		}
		//x for rows, y for columns, and row denotes the number of rows to print 
		int x,y, row=5; 
		//outer loop for rows 
		for(x=0; x<row; x++) 
		{ 
		//inner loop for columns 
		for(y=0; y<=x; y++) 
		{ 
		//To prints stars 
		System.out.print("* "); 
		} 
		//Cursor goes to the new line after printing each line. 
		System.out.println(); 
		} 
		//Fibonacci numbers
		int a = 0, b = 1, c, i, count = 10;
		// To print 0 and 1
		System.out.print(a + " " + b);
		// loop starts from 2. We have already printed 0 and 1 in the previous step
		for (i = 2; i < count; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		
	}

}
