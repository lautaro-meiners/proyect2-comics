package com.globant.academy.proyect2_comics;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	Catalog.addComics(new Comics("Batman","Bob Kane && Bill Finger", "Mint", "Superheroes", 1));
    	Catalog.addComics(new Comics("Spider Man","Stan Lee && Steve Ditko", "Mint", "Superheroes", 2));
    	Catalog.displayComics().forEach(s-> System.out.println(s.toString()));
    	Scanner input = new Scanner(System.in);
    	String username;
    	String password;
    	
    	System.out.println("Log in:");
    	System.out.println("Username:");
    	username = input.next();
    	
    	System.out.println("Password:");
    	password = input.next();
    	
    	if(username.equals("Sheldon") && password.equals("Bazinga")){
    		System.out.println("Welcome Dr.Cooper");
    		AdminMenu displayMenu = new AdminMenu();
    	} else if(username.equals("Howard") && password.equals("Engineering")){
    		System.out.println("Welcome Howard");
    		UserMenu displayMenu = new UserMenu();
    	} else if(username.equals("Leonard") && password.equals("Penny")){
    		System.out.println("Welcome Leonard");
    		UserMenu displayMenu = new UserMenu();
    	}
    	
    	/*System.out.println("Select any of the options below");
    	System.out.println("0) Watch Comics list");
    	System.out.println("1) Add new comics");
    	System.out.println("2) Modify existing comics");
    	System.out.println("3) Delete existing comics");
    	System.out.println("4) Accept new users");
    	System.out.println("5) Delete existing users");
    	System.out.println("6) Watch existing users");
    	System.out.println("7) Accept new loans");
    	System.out.println("8) Modify existing loans");
    	System.out.println("9) Delete existing loans");
    	System.out.println("10) Watch existing loans");
    	System.out.println("11) Add new genres");
    	System.out.println("12) Modify existing genres");
    	System.out.println("13) Delete existing genres");
    	System.out.println("14) Watch existing genres");

    	Scanner input = new Scanner(System.in);
        
        int  i =input.nextInt();
        
        Admin test = new Admin();
        test.adminActivity(i);
        input.close();*/
    }
}
