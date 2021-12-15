package com.star.patterns;

import java.util.Scanner;

public class UnitMatrix {

	public static void main(String[] args) {

		//3x3 Array sized array

		int[][]arr = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter Number: ");
				Scanner sc = new Scanner(System.in);
				arr[i][j] = sc.nextInt();
				System.out.println("Your Array is : "+arr[i][j]);
			}

		}

		int digonal_sum = arr[0][0]+arr[1][1]+arr[2][2];
		int non_digonal = arr[0][1]+arr[0][2]+arr[1][0]+arr[1][2]+arr[2][0]+arr[2][1];
		if(digonal_sum==3 && non_digonal==0) {
			System.out.println("Your Matrix is Unit");
		}
		else {
			System.out.println("Not Unit Matrix");
		}
	}


}
