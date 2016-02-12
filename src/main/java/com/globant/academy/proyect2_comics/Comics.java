package com.globant.academy.proyect2_comics;

public class Comics {
	private String title;
	private String author;
	private String condition;
	private String genre;
	private int comicId;
	private boolean rendered;
	private int copies;
	
	
	public Comics(String title,String author,String condition,String genre,int comicId){
		this.title = title;
		this.author = author;
		this.condition = condition;
		this.genre = genre;
		this.comicId = comicId;
		this.rendered = false;
	}
	
	public String toString(){
		return "Title:" + title + " Author:" + author +" Condition:" + condition + " Genre:" + genre + " Comic Id:" + comicId + " Rendered?:" + rendered;
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
	
	
	public void increaseCopies(){
		this.copies = copies + 1;
	}
	
	public boolean removeCopies (){
		if (copies >= 1){
			this.copies = copies - 1;
			return true;
		} 
		return false;
	}
	
	
}
