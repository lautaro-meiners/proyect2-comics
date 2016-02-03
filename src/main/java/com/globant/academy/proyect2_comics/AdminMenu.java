package com.globant.academy.proyect2_comics;

import java.util.Scanner;

public class AdminMenu {
	{
	System.out.println("********************************");
	System.out.println("Select any of the options below");
	System.out.println("********************************");
	System.out.println("0) Watch Comics list");
	System.out.println("********************************");
	System.out.println("1) Add new comics");
	System.out.println("********************************");
	System.out.println("2) Modify existing comics");
	System.out.println("********************************");
	System.out.println("3) Delete existing comics");
	System.out.println("********************************");
	System.out.println("4) Accept new users");
	System.out.println("********************************");
	System.out.println("5) Delete existing users");
	System.out.println("********************************");
	System.out.println("6) Watch existing users");
	System.out.println("********************************");
	System.out.println("7) Accept new loans");
	System.out.println("********************************");
	System.out.println("8) Modify existing loans");
	System.out.println("********************************");
	System.out.println("9) Delete existing loans");
	System.out.println("********************************");
	System.out.println("10) Watch existing loans");
	System.out.println("********************************");
	System.out.println("11) Add new genres");
	System.out.println("********************************");
	System.out.println("12) Modify existing genres");
	System.out.println("********************************");
	System.out.println("13) Delete existing genres");
	System.out.println("********************************");
	System.out.println("14) Watch existing genres");
	System.out.println("********************************");

	Scanner input = new Scanner(System.in);

	int  i =input.nextInt();

	Admin test = new Admin();
	test.adminActivity(i);
	input.close();
}
}

