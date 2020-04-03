package com.java.learning.arrayrotation;

public class SampleArray {

	public static void main(String[] args) {
		//int temp1,temp2;
		String [] cars = {"kalyan", "haritha", "abhiram"};
		System.out.println("print String array length " + cars.length);
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		//temp1=cars[0];
		System.out.println("This is rorating an array to left ");
		cars[0] =cars[1];
		System.out.println("Printing value of cars[0]" +cars[0]);
		cars[1]=cars[2];
		System.out.println("Printing value of cars[1]" +cars[1]);
		cars[2]=cars[0];
		System.out.println("Printing value of cars[2]" +cars[2]);
		
		
		int [] num = {20,30,40, 50};
		
		System.out.println("print integer array length " + num.length);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		
		System.out.println("This is rorating an array to right ");
		num[3]=num[2];
		System.out.println("printing value of num[3] " +num[3]);
		num[2]=num[1];
		System.out.println("printing value of num[2] " +num[2]);
		num[1]=num[0];
		System.out.println("printing value of num[1] " +num[1]);
		num[0]=num[3];
		System.out.println("printing value of num[0] " +num[0]);
	}

}

/* output:
 * print String array length 3
kalyan
haritha
abhiram
This is rorating an array to left 
Printing value of cars[0]haritha
Printing value of cars[1]abhiram
Printing value of cars[2]haritha
print integer array length 4
20
30
40
50
This is rorating an array to right 
printing value of num[3] 40
printing value of num[2] 30
printing value of num[1] 20
printing value of num[0] 40

 * 
 * 
 */
	
	