package com.globant.academy.proyect2_comics;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends People{
	private String username;
	private String password;
	private ArrayList<Loans> loans;
	
	public User(){}
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public String toString(){
		return "Username:" + username + " Password:" + password;
	}
	
	final private String[] userActivities =
		{
				"0) Watch comics list",
				"1) Watch loans",
				"2) Ask for a loan",
				"3) Return comic",
				"4)Log out",
		};
	
	public enum userActivity{
		WATCH_COMICS(0),
		WATCH_LOANS(1),
		ASK_FOR_LOANS(2),
		RETURN_COMIC(3),
		LOG_OUT(4);
		
		private final int code;
		userActivity(int code) {this.code = code;}
		public int getCode() {return code;}
		
	}
	
	public static void consoleInputs(){
		ConsoleInputs.readInputInt();
	}
	
	public void userActivity(int a){
		switch(a){
		
		case 0: 
			System.out.println("This is the list of comics available");
			this.watchComicList();
			break;
			
		case 1:
			System.out.println("This is the list of your active loans");
			this.watchLoans();
			break;
			
		case 2:
			System.out.println("Ask for a loan");
			this.askForLoan();
			break;
			
		case 3:
			System.out.println("Return comic");
			this.returnComic();
			break;
			
		case 4:
			System.out.println("You have logged out");
			this.logOut();
			break;
		}		
	}
	
	// userActivity 0
	public void watchComicList(){
		Catalog.displayComics().forEach(s-> System.out.println(s.toString()));
	}
	
	//userActivity 1
	public void watchLoans(){
		
	}
	
	//userActivity 2
	public void askForLoan(){
		System.out.println("Choose the comic Id of the comic you want to borrow from Dr.Sheldon");
		Catalog.displayComics().forEach(s-> System.out.println(s.toString()));
		Comics chosenComic = Catalog.displayComics().get(ConsoleInputs.readInputInt());
		System.out.println("You chose:");
		System.out.println(chosenComic.toString());
	}
	
	//userActivity 3
	public void returnComic(){
		
	}
	
	//userActivity 4
	public void logOut(){
		System.out.println("Have a nice day!");
	}
	
	public boolean equals(User users){
		if(users == this){
			return true;
		} else{
			return false;
		}
	}
}
