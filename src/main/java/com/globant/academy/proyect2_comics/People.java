package com.globant.academy.proyect2_comics;

import java.util.ArrayList;

public class People {
	private String name;
	private int id;
	private String address;
	private int phoneNumber;
	private String email;
	
	public ArrayList<Comics> displayComics(){
		return new Catalog().displayComics();
	}
	
	
	final private String [] peopleActivities =
		{
				"0)Watch comics list",
				"1)Log in",
				"2)Log out",
		};
	
	
	public enum peopleActivity{
		WATCH_COMICS(0),
		REQUEST_USER_PASS(1),
		LOG_OUT(2);
		
		private final int codePerson;
		peopleActivity(int codePerson) {this.codePerson = codePerson;}
		public int getcodePerson() {return codePerson;}
	}
	
	
	/*public void peopleActivities(int b){
		switch (b){
		
		case 0: 
			System.out.println("This is the list of comics available");
			Catalog.displayComics().forEach(s -> System.out.println(s));
			break;
		
		//case 1:
			//System.out.println("Request a username and password");
			
		
		}
		*/
	
	public People WATCH_COMICS(){
		Catalog.displayComics().forEach(s -> System.out.println(s));
		return this;
	}
	
	
	
	
	
	}
	

