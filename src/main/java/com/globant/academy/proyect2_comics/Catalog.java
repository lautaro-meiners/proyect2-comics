package com.globant.academy.proyect2_comics;

import java.util.ArrayList;

public class Catalog {
	private static ArrayList<Comics> comics = new ArrayList<Comics>();
	private static ArrayList<Loans> loans = new ArrayList<Loans>();
	private static ArrayList<User> users = new ArrayList<User>();
	private static ArrayList<String> genres = new ArrayList<String>();
	
	public static ArrayList<Comics> displayComics(){
		return comics;
	}
	
	public static ArrayList<Loans> displayLoans(){
		return loans;
	}
	
	public static ArrayList<User> displayUsers(){
		return users;
	}
	
	public static ArrayList<String> displayGenres(){
		return genres;
	}

	public static void addComics(Comics comic){
		comics.add(comic);
	}
	
	public static void removeComics(Comics comic){
		comics.remove(comic);
	}
	
	public static void addLoan(Loans loan){
		loans.add(loan);
	}
	
	public static void removeLoan(Loans loan){
		loans.remove(loan);
	}
	
	public static void addUsers(User user){
		users.add(user);
	}
	
	public static void removeUsers(User user){
		users.remove(user);
	}
	
	public static void addGenres(String genre){
		genres.add(genre);
	}
	
	public static void removeGenres(String genre){
		genres.remove(genre);
	}
}
	
	
	