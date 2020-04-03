package com.java.learning.arrayrotation;

public class MultiDimension {

	public static void main(String[] args) {

		int number[][] = new int[4][5];
		int i, j, k = 0;

		for (i = 0; i < 4; i++) {

			for (j = 0; j < 5; j++) {

				number[i][j] = k;

				k++;

			}

		}
		for (i = 0; i < 4; i++) {

			for (j = 0; j < 5; j++) {

				System.out.print( number[i][j] +  "  ");
			}
			System.out.println();
		}

		
	}

}
