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
}
