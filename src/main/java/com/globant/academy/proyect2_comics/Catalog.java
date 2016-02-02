package com.globant.academy.proyect2_comics;

import java.util.ArrayList;

public class Catalog {
	private static ArrayList<Comics> comics = new ArrayList<Comics>();
	private static ArrayList<Loans> loans = new ArrayList<Loans>();
	private static ArrayList<User> users = new ArrayList<User>();
	private static ArrayList<String> genres = new ArrayList<String>();
	
	public ArrayList<Comics> displayComics(){
		return comics;
	}
	
	public ArrayList<Loans> displayLoans(){
		return loans;
	}
	
	public ArrayList<User> displayUsers(){
		return users;
	}
	
	public ArrayList<String> displayGenres(){
		return genres;
	}
	
	public void addComics(Comics comics){
		comics.add(comics);
	}
	
	public void addLoans (Loans loans){
		loans.add(loans);
	}
	
	public void addUsers (User users){
		users.add(users);
	}
}
