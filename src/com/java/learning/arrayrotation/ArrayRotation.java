package com.java.learning.arrayrotation;

public class ArrayRotation {

	// Driver program to test above functions

	public static void main(String[] args) {

		ArrayRotation rotate = new ArrayRotation();// cerating an object of class arratRotation
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };// initialising an array

		System.out.println(" Left Rotate  ");
		rotate.leftRotate(arr, 2, 7);//
		rotate.printArray(arr, 7);

		System.out.println(" \n Left Rotate by one ");
		rotate.leftRotatebyOne(arr, 7);
		rotate.printArray(arr, 7);

		System.out.println(" \n right  Rotate  ");
		rotate.rightRotate(arr, 3, 7);
		rotate.printArray(arr, 7);

	}

	/* Function to left rotate arr[] of size n by d */
	void leftRotate(int arr[], int d, int n) {
		for (int i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
	}

	void leftRotatebyOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
	}

	/* Function to right rotate arr[] of size n by d */
	void rightRotate(int arr[], int d, int n) {
		for (int i = n; i > d; i--)
			rightRotatebyOne(arr, n);
	}

	void rightRotatebyOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
	}

	/* utility function to print an array */
	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
