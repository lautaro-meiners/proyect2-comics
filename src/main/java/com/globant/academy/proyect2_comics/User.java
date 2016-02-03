package com.globant.academy.proyect2_comics;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends People{
	private String username;
	private String password;
	private ArrayList<Loans> loans;
	
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
	
	private static int userInput;{
		Scanner input = new Scanner(System.in);
		input.equals(input);
		input.close();
	}
	
	public void userActivity(int i){
		switch(i){
		
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
			System.out.println("Log out");
			this.logOut();
			break;
		}		
	}
	
	// userActivity 0
	public void watchComicList(){
		
	}
	
	//userActivity 1
	public void watchLoans(){
		
	}
	
	//userActivity 2
	public void askForLoan(){
		
	}
	
	//userActivity 3
	public void returnComic(){
		
	}
	
	//userActivity 4
	public void logOut(){
		
	}
	
	
}
