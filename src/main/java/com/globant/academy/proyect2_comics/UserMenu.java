package com.globant.academy.proyect2_comics;

import java.util.Scanner;

public class UserMenu {
	{
	System.out.println("********************************");
	System.out.println("Select any of the options below");
	System.out.println("********************************");
	System.out.println("0) Watch comics list");
	System.out.println("********************************");
	System.out.println("1) Watch loans");
	System.out.println("********************************");
	System.out.println("2) Ask for a loan");
	System.out.println("********************************");
	System.out.println("3) Return comic");
	System.out.println("********************************");
	System.out.println("4)Log out");
	System.out.println("********************************");
	
	Scanner input = new Scanner(System.in);

	int  i =input.nextInt();

	User test = new User();
	test.userActivity(i);
	input.close();
	}
}
