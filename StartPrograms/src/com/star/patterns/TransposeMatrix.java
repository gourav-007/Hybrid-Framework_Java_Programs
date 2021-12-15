package com.star.patterns;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		int [][] arr = new int [3][3];
		int [][] krr = new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter Number: ");
				Scanner kb = new Scanner(System.in);
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println("Transpose Matrix: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				krr[i][j] = arr[j][i];
				System.out.print(krr[i][j]+" ");
			}
			System.out.println();	

		}

	}

}
