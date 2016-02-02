package com.globant.academy.proyect2_comics;

public class Admin extends User{
	private static String username = "Sheldon";
	private static String password = "Bazinga";
	final private String[] adminActivities = 
		{"0) Watch Comics list",
		 "1) Add new comics",
		 "2) Modify existing comics",
		 "3) Delete existing comics",
		 "4) Accept new users",
		 "5) Delete existing users",
		 "6) Watch existing users",
		 "7) Accept new loans",
		 "8) Modify existing loans",
		 "9) Delete existing loans",
		 "10) Watch existing loans",
		 "11) Add new genres",
		 "12) Modify existing genres",
		 "13) Delete existing genres",
		 "14) Watch existing genres"}
	
	public void addUser(User user){
		Catalog.addUser(user);
	}
	
	public void addLoan(Loans loan){
		Catalog.addLoan(loan);
	}
	
	public void removeUser(User user){
		Catalog.removeUser(user);
	}
	
	//adminActivity0
	public void watchComicList(){
		
	}
	
	//adminActivity1
	public void addNewComics(){
		
	}
	
	//adminActivity2
	public void modifyExistingComics(){
		
	}
	
	//adminActivity3
	public void deleteExistingComics(){
		
	}
	
	//adminActivity4
	public void acceptNewUsers(){
		
	}
	
	//adminActivity5
	public void deleteExistingUsers(){
		
	}
	
	//adminActivity6
	public void watchExistingUsers(){
		
	}
	
	//adminActivity7
	public void acceptNewLoans(){
		
	}
	
	//adminActivity8
	public void modifyExistingLoans(){
		
	}
	
	//adminActivity9
	public void deleteExistingLoans(){
		
	}
	
	//adminActivity10
	public void watchExistingLoans(){
		
	}
	
	//adminActivity11
	public void addNewGenres(){
		
	}
	
	//adminActivity12
	public void modifyExistingGenres(){
		
	}
	
	//adminActivity13
	public void deleteExistingGenres(){
		
	}
	
	//adminActivity14
	public void watchExistingGenres(){
		
	}
}
