/* Author : Prasanthi
   Created on : 06 Apr 2023
   Purpose :learning core java basic java code for scripting
 */

package com.test;
import java.util.Scanner;

public class Facebookexplore {

	public static void main(String[] args) {
		
		/*System.out.println("First java program: Hello Anil");
		System.out.println("Selenium testing programm");
		System.out.print("First java program: Hello Anil:");
        System.out.println();*/
		
       // Iterative statements
       /*for(int a=0;a<2;a++){
           System.out.println("Selenium testing programm");
         }*/
       // trying to test the infinite loop if condition is true
       //int b=5, c=3;
       /*while(b>c)
       {
    	   System.out.println("b is greater than c");
       } */
       // trying to test the loop if condition is false
       /*while(b<c)
       {
    	   System.out.println("condition will not exicute");
       }*/
       //int i=0;
       /*while(i<b)
       {
    	   System.out.println("condition will exicute until i is less than b and i is: "+i);
    	   i++;
       }*/
       /*do
       {
    	   System.out.println("condition will exicute until i is less than c and i is: "+i);
    	   i++;
       }while(i<c); */
       
      /* while(i<b)
       {
    	   if(i==2)
    	   {
    		 System.out.println(" value of i is eaqual to 2"); 
    		 break;
    	   }
    	   System.out.println("condition will exicute until i is less than b and i is: "+i);
    	   i++;
       }*/
       
      /* while(i<4)
       {
    	   if(i==2)
    	   {
    		   i++;
    		 System.out.println(" value of i is equal to 2"); 
    		 continue;
    	   }
    	   System.out.println("condition will execute until i is less than b and i is: "+i);
    	   i++;
       }*/
        // Java arrays,methods and variables
		//-------------------------------------------------------------
       // single dimensional arrays(Declare,create,Assign,Access)
       //int a[] = new int[3]; 
		//int[] a = new int[3];// Declaration and creation of arrays
		//int[] a = {9,8,7};
       // Assigning values to arrays
       //a[0] = 9;
       //a[1] = 8;
       //a[2] = 7;
       //a[3] = 3;*/ 
		//throws an error when we exceede the size of array 
		//System.out.println("the size of the arra is : "+a.length);
       //Accessing the array elements
		//System.out.println(a[0]);
	       //System.out.println(a[1]);
	      // System.out.println(a[2]);
		/*for(int i=0; i<a.length; i++)
		{
		System.out.println(a[i]);
		}*/
		
		//for each loop is preferred in arrays
		//for(int i:a) {System.out.println(i);}
		//-------------------------------------------------------------
		//Tow Dimensional Arrays
		//TYPE #1
		/*int[][] a= new int[2][3];
		a[0][0]= 9;
		a[0][1]= 7;
		a[0][2] = 5;
		
		a[1][0] = 1;
		a[1][1] = 2;
		a[1][2] = 3;
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		*/
		//TYPE #2 For loop with two dimensional arrays
		/*int [][] a = { {9,7,5},{1,2,3}};
		System.out.println(a[0].length);
		System.out.println(a.length);
		for (int row=0; row<a.length; row++)
		{
			for(int col=0; col<a[0].length; col++)
			{
				System.out.println(a[row][col]);
			}
		}*/
	Scanner scanner = new Scanner(System.in);
		Object[] a = {1,123,'p',"hasthi"};
		for(Object i:a)
		{
			System.out.println(i);
		}

	}

}
