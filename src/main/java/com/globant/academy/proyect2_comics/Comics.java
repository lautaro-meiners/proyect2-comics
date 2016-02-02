package com.globant.academy.proyect2_comics;

public class Comics {
	private String title;
	private String author;
	private String condition;
	private String genre;
	private int comicId;
	private boolean rendered;
	
	public String toString(){
		return "Title:" + title + "\nAuthor:" + author +"\nCondition:" + condition + "\nGenre:" + genre + "\nComic Id:" + comicId + "\nRendered?" + rendered;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCondition() {
		return condition;
	}

	public String getGenre() {
		return genre;
	}

	public int getComicId() {
		return comicId;
	}

	public boolean isRendered() {
		return rendered;
	}
	
	
}
