package com.star.patterns;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramProgram {

	public static void main(String[] args) {
		System.out.println("Enter first String ?");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char strarr[] = s1.toCharArray();
		Arrays.sort(strarr);
		System.out.println("Enter Second String ?");
		Scanner kb = new Scanner(System.in);
		String s2 = kb.nextLine();
		char strarray[] = s2.toCharArray();
		Arrays.sort(strarray);
		if(Arrays.equals(strarr, strarray)) {
			System.out.println("Given String is Anagram.");
		}
		else {
			System.out.println("Given string is not Anagram.");
		}

	}
}