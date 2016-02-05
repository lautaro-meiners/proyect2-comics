package com.globant.academy.proyect2_comics;

import java.util.ArrayList;
import java.util.Scanner;

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
		 "14) Watch existing genres"};
	
	
	public enum adminActivity{
		WATCH_COMICS(0),
		ADD_COMICS(1),
		MODIFY_COMICS(2),
		DELETE_COMICS(3),
		ACCEPT_USERS(4),
		DELETE_USERS(5),
		WATCH_USERS(6),
		ACCEPT_LOANS(7),
		MODIFY_LOANS(8),
		DELETE_LOANS(9),
		WATCH_LOANS(10),
		ADD_GENRE(11),
		MODIFY_GENRES(12),
		DELETE_GENRES(13),
		WATCH_GENRES(14);
	
	
	private final int code;
	adminActivity(int code) {this.code = code;}
	public int getCode() {return code;}
	
	}
	
	public static void consoleInputs(){
		ConsoleInputs.readInputInt();
	}
	
	public void adminActivity(int i){
		switch (i){
		
		case 0:
			System.out.println("This is the list of Comics available right now");
			this.watchComicList();
			break;
		
		
		case 1:
			System.out.println("Add new comics");
			this.addNewComics();
			break;
			
		case 2: // Los metodos modify no los voy a implementar
			System.out.println("Modify existing comics");
			this.modifyExistingComics();
			break;
			
		case 3:
			System.out.println("Delete existing comics");
			this.deleteExistingComics();
			break;
			
		case 4:
			System.out.println("Accept new users");
			this.acceptNewUsers();
			break;
			
		case 5:
			System.out.println("Delete existing users");
			this.deleteExistingUsers();
			break;
			
		case 6:
			System.out.println("Watch existing users");
			this.watchExistingUsers();
			break;
			
		case 7:
			System.out.println("Accept new loans");
			this.acceptNewLoans();
			break;
			
		case 8: // Los metodos modify no los voy a implementar
			System.out.println("Modify existing loans");
			this.modifyExistingLoans();
			break;
			
		case 9:
			System.out.println("Delete existing loans");
			this.deleteExistingLoans();
			break;
			
		case 10:
			System.out.println("Watch existing loans");
			this.watchExistingLoans();
			break;
			
		case 11:
			System.out.println("Add new genres");
			this.addNewGenres();
			break;
			
		case 12: // Los metodos modify no los voy a implementar
			System.out.println("Modify existing genres");
			this.modifyExistingGenres();
			break;
			
		case 13:
			System.out.println("Delete existing genres");
			this.deleteExistingGenres();
			break;
			
		case 14:
			System.out.println("Watch existing genres");
			this.watchExistingGenres();
			break;
	}

	
	}
	public void addUser(User user){
		Catalog.addUsers(user);
	}
	
	public void addLoan(Loans loan){
		Catalog.addLoan(loan);
	}
	
	public void removeUser(User user){
		Catalog.removeUsers(user);
	}
	
	
	//adminActivity0
	public void watchComicList(){
		super.watchComicList();
	}
	
	//adminActivity1
	public People addNewComics(){
		System.out.println("Write title, author, condition, genre and comicId of the new comic");
		Comics comic = new Comics(ConsoleInputs.readInputString(), ConsoleInputs.readInputString(), ConsoleInputs.readInputString(), ConsoleInputs.readInputString(), ConsoleInputs.readInputInt());
		Catalog.addComics(comic);
		Catalog.displayComics().forEach(s-> System.out.println(s.toString()));
		return this;
	}
	
	//adminActivity2
	public void modifyExistingComics(){
		
	}
	
	//adminActivity3
	public void deleteExistingComics(){
		System.out.println("Choose comic Id of the comic you want to delete");
		Catalog.displayComics().forEach(s-> System.out.println(s.toString()));
		Catalog.displayComics().remove(ConsoleInputs.readInputInt());
		Catalog.displayComics().forEach(s-> System.out.println(s.toString()));
	}
	
	//adminActivity4
	public void acceptNewUsers(){
		System.out.println("Enter new User´s Username and Password");
		User user = new User(ConsoleInputs.readInputString(), ConsoleInputs.readInputString());
		Catalog.addUsers(user);
		Catalog.displayUsers().forEach(s->System.out.println(s.toString()));		

	}
	
	//adminActivity5
	public void deleteExistingUsers(){
		System.out.println("Choose the user´s name you want to delete");
		Catalog.displayUsers().forEach(s-> System.out.println(s.toString()));
		User user = new User(ConsoleInputs.readInputString(), ConsoleInputs.readInputString());
		Catalog.removeUsers(user);
		Catalog.displayUsers().forEach(s->System.out.println(s.toString()));
	}
	
	//adminActivity6
	public void watchExistingUsers(){
		System.out.println("The list of existing users is:");
		Catalog.displayUsers().forEach(s-> System.out.println(s.toString()));

	}
	
	//adminActivity7
	public void acceptNewLoans(){
		System.out.println("Accept new loan");
		Loans loan = new Loans(ConsoleInputs.readInputInt(),Catalog.displayComics().get(ConsoleInputs.readInputInt()), (People) Catalog.displayUsers().stream().filter(s->s.getUser().equals(ConsoleInputs.readInputString())).toArray()[0], ConsoleInputs.readInputString());
		Catalog.addLoan(loan);
		Catalog.displayLoans().forEach(s-> System.out.println(s.toString()));
	}
	
	//adminActivity8
	public void modifyExistingLoans(){
		
	}
	
	//adminActivity9
	public void deleteExistingLoans(){
		System.out.println("Choose id of the Loan you want to remove");
		Catalog.displayLoans().forEach(s-> System.out.println(s.toString()));
		Loans loans1 = new Loans(ConsoleInputs.readInputInt(), null, null, null);
		Catalog.removeLoan(loans1);
		Catalog.displayLoans().forEach(s-> System.out.println(s.toString()));

	}
	
	//adminActivity10
	public void watchExistingLoans(){
		super.watchLoans();
	}
	
	//adminActivity11
	public void addNewGenres(){
		System.out.println("Add a new genre:");
		Catalog.displayGenres().forEach(s-> System.out.println(s.toString()));
		String genre = new String(ConsoleInputs.readInputString());
		Catalog.addGenres(genre);
		Catalog.displayGenres().forEach(s-> System.out.println(s.toString()));
	}
	
	//adminActivity12
	public void modifyExistingGenres(){
		
	}
	
	//adminActivity13
	public void deleteExistingGenres(){
		System.out.println("Enter the name of the genre you want to delete");
		Catalog.displayGenres().forEach(s-> System.out.println(s.toString()));
		String genre = new String(ConsoleInputs.readInputString());
		Catalog.removeGenres(genre);
		Catalog.displayGenres().forEach(s-> System.out.println(s.toString()));

	}
	
	//adminActivity14
	public void watchExistingGenres(){
		Catalog.displayGenres().forEach(s-> System.out.println(s));

	}
	
}
