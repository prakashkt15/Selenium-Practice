package com.nikhil;

import java.util.Scanner;

public class palindrom {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s1=sc.next();
	String s2="";
	
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
		
	}
	if(s2.equals(s1)) {
		System.out.println(s1+ "is a palindrom");
	}
	else {
		System.out.println(s1+ "is not a palindrom");
	}
}
}
