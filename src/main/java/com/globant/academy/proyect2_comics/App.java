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
    	Comics comic1 = new Comics("Batman","Bob Kane && Bill Finger", "Mint", "Superheroes",0);
    	Catalog.addComics(comic1);
    	Catalog.addComics(new Comics("Spider Man","Stan Lee && Steve Ditko", "Mint", "Superheroes", 1));
    	Catalog.addComics(new Comics("Green Arrow","Mort Weisinger && George Papp", "Near-Mint", "Superheroes", 2));
    	Catalog.addComics(new Comics("Hal Jordan","Gil Kane && John Broome", "Mint", "Superheroes", 3));
    	Catalog.addComics(new Comics("Super Man","Jerry Siegel && Joe Schuster", "Mint", "Superheroes", 4));
    	Catalog.addComics(new Comics("Wonder Woman","William Marston && Gardner Fox", "Near-Mint", "Superheroes", 5));
    	Catalog.addComics(new Comics("Mr.Fantastic","Jack Kirby && Stan Lee", "Mint", "Superheroes", 6));
    	Catalog.addComics(new Comics("Space Riders","Fabian Rangel && Alexis Ziritt", "Near-Mint", "Science Fiction", 7));
    	Catalog.addComics(new Comics("Descender","Jeff Lemire", "Mint", "Science Fiction", 8));
    	Catalog.addComics(new Comics("Chrononauts","Mark Millar", "Near-Mint", "Science Fiction", 9));
    	Catalog.addComics(new Comics("Nameless","Grant Morrison", "Mint", "Science Fiction", 10));


    	Catalog.displayComics().forEach(s-> System.out.println(s.toString()));
    	String username;
    	String password;
    	
    	User user1 = new User("Howard", "Engineering");
    	Catalog.addUsers(user1);
    	Catalog.addUsers(new User("Leonard", "Penny"));
    	Catalog.addGenres(new String("Superheroes"));
    	Catalog.addGenres(new String("Science Ficiton"));
    	Catalog.addLoan(new Loans(0, comic1, user1, "Return in two weeks"));
    	System.out.println("Log in:");
    	System.out.println("Username:");
    	username = ConsoleInputs.readInputString();
    	
    	System.out.println("Password:");
    	password = ConsoleInputs.readInputString();
    	
    	
    	if(username.equals("Sheldon") && password.equals("Bazinga")){
    		System.out.println("Welcome Dr.Cooper");
    		AdminMenu displayMenu = new AdminMenu();
    	} else if(username.equals("Howard") && password.equals("Engineering")){
    		System.out.println("Welcome Howard");
    		UserMenu displayMenu = new UserMenu();
    	} else if(username.equals("Leonard") && password.equals("Penny")){
    		System.out.println("Welcome Leonard");
    		UserMenu displayMenu = new UserMenu();
    	} else {
    		System.out.println("Invalid username or password");
    	}
    	
    	ConsoleInputs.close();
    	
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
