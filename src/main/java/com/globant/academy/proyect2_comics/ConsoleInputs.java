package com.globant.academy.proyect2_comics;

import java.util.Scanner;

public class ConsoleInputs {

	private static Scanner sc = new Scanner (System.in);
	
	public static void close(){
		sc.close();
	}
	
	public static int readInputInt(){
		return sc.nextInt();
	}
	
	public static String readInputString(){
		return sc.next();
	}
	
	
}
